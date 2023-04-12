package org.workshop.api.requests;

import org.workshop.api.models.NewProjectDescription;
import org.workshop.api.models.Project;

import static org.apache.http.HttpStatus.SC_OK;

public class CheckedRequest {

    private final Request request = new Request();

    public String getCsrfToken() {
        return request.getCsrfToken().then().assertThat().statusCode(SC_OK)
                .extract().response().asString();
    }

    public Project createProject(NewProjectDescription project) {
        return request.createProject(project)
                .then().assertThat().statusCode(SC_OK)
                .extract().response().as(Project.class);
    }
}
