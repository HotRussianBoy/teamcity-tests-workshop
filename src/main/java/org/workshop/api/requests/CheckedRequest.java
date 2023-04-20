package org.workshop.api.requests;

import org.workshop.api.models.*;

import static org.apache.http.HttpStatus.SC_OK;

public class CheckedRequest{

    private final Request request = new Request();

    public String getCsrfToken() {
        return request.getCsrfToken().then().assertThat().statusCode(SC_OK)
                .extract().response().asString();
    }

    /**public String getBuild(Long buildId) {
        return request.getBuild(buildId).then().assertThat().statusCode(SC_OK)
                .extract().response().asString();
    }*/

    public Project createProject(NewProjectDescription project) {
        return request.createProject(project)
                .then().assertThat().statusCode(SC_OK)
                .extract().response().as(Project.class);
    }

    public VcsRoot createVCS(VcsRoot vcsRoot) {
        return request.createVCS(vcsRoot)
                .then().assertThat().statusCode(SC_OK)
                .extract().response().as(VcsRoot.class);
    }

    public BuildType createBuildType(BuildType buildType) {
        return request.createBuildConfig(buildType)
                .then().assertThat().statusCode(SC_OK)
                .extract().response().as(BuildType.class);
    }

    public Build runBuild (Build build) {
        return request.runBuild(build)
                .then().assertThat().statusCode(SC_OK)
                .extract().response().as(Build.class);
    }

    /**public String waitBuildFinished(Long buildId) {
        var build = getBuild(buildId).equals();
        if (build.get)

    }*/
}
