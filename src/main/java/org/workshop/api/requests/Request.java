package org.workshop.api.requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.workshop.api.models.Build;
import org.workshop.api.models.BuildType;
import org.workshop.api.models.NewProjectDescription;
import org.workshop.api.models.VcsRoot;
import org.workshop.api.specifications.Specifications;

import static io.restassured.RestAssured.given;

public class Request {
    private static final String AUTHENTICATION_ENDPOINT = "/authenticationTest.html?csrf";
    private static final String PROJECT_ENDPOINT = "/app/rest/projects";
    private static final String VCS_ENDPOINT = "/app/rest/vcs-roots";
    private static final String BUILD_ENDPOINT = "/app/rest/buildTypes";
    private static final String BUILD_QUEUE_ENDPOINT = "/app/rest/buildQueue";
    private static final String BUILDS = "/app/rest/builds/";

    private final Specifications spec = new Specifications();

    public Response getCsrfToken() {
        return RestAssured.get(AUTHENTICATION_ENDPOINT);
    }

    /**public Response getBuild(Long buildId) {
        return RestAssured.get(BUILDS + "id:"+buildId+"");
    }*/


    public Response createProject(NewProjectDescription project) {
        return given().spec(spec.reqSpec()).body(project).post(PROJECT_ENDPOINT);
    }

    public Response createVCS(VcsRoot vcsRoot) {
        return given().spec(spec.reqSpec()).body(vcsRoot).post(VCS_ENDPOINT);
    }

    public Response createBuildConfig(BuildType buildType) {
        return given().spec(spec.reqSpec()).body(buildType).post(BUILD_ENDPOINT);
    }

    public Response runBuild(Build build) {
        return given().spec(spec.reqSpec()).body(build).post(BUILD_QUEUE_ENDPOINT);
    }
}
