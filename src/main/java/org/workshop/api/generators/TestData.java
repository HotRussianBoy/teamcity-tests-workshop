package org.workshop.api.generators;

import lombok.Builder;
import lombok.Data;
import org.workshop.api.models.Build;
import org.workshop.api.models.BuildType;
import org.workshop.api.models.NewProjectDescription;
import org.workshop.api.models.VcsRoot;
import org.workshop.api.requests.Request;

@Data
@Builder
public class TestData {
    private NewProjectDescription newProjectDescription;
    private VcsRoot vcsRoot;
    private BuildType buildType;
    private Build build;
}


