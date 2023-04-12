package org.workshop.api.generators;

import org.workshop.api.models.*;

import java.util.ArrayList;
import java.util.List;

public class TestDataGenerator {
    private final RandomData randomData = new RandomData();
    private final String id = randomData.getString();

    public TestData generateProject() {
        return TestData.builder()
                .newProjectDescription(
                        NewProjectDescription.builder()
                            .id(id)
                            .name(randomData.getString())
                            .parentProject(
                                    ParentProject.builder()
                                            .locator("_Root")
                                            .build()
                            )
                            .copyAllAssociatedSettings(randomData.getBoolean())
                            .build())
                .build();
    }
    public TestData generateVCS() {

        return TestData.builder()
                .vcsRoot(VcsRoot.builder()
                        .id(randomData.getString())
                        .name(randomData.getString())
                        .vcsName("jetbrains.git")
                        .project(Project.builder()
                                .id(id)
                                .build())
                        .properties(Properties.builder()
                                .property()
                                .build())
                        .build())
                .build();
    }


}
