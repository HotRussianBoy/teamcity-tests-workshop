package org.workshop.api.requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.workshop.api.models.NewProjectDescription;
import org.workshop.api.models.VcsRoot;
import org.workshop.api.specifications.Specifications;

import static io.restassured.RestAssured.given;

public class Request {
    private static final String AUTHENTICATION_ENDPOINT = "/authenticationTest.html?csrf";
    private static final String PROJECT_ENDPOINT = "/app/rest/projects";
    private static final String VCS_ENDPOINT = "/vcs-roots";

    private final Specifications spec = new Specifications();

    public Response getCsrfToken() {
        return RestAssured.get(AUTHENTICATION_ENDPOINT);
    }

    public Response createProject(NewProjectDescription project) {
        return given().spec(spec.reqSpec()).body(project).post(PROJECT_ENDPOINT);
    }

    public Response createVCS(VcsRoot vcsRoot) {
        return given().spec(spec.reqSpec()).body(vcsRoot).post(VCS_ENDPOINT);
    }
}
