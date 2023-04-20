package org.workshop.api.generators;

import org.workshop.api.models.*;

import java.util.List;

public class TestDataGenerator {
    private final RandomData randomData = new RandomData();
    private final String id = randomData.getString();
    private final String buildId = randomData.getString();
    private final PropertiesGenerator propertiesGenerator = new PropertiesGenerator();

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
                        .properties(propertiesGenerator.getBasicVcsProp())
                        .build())
                .build();
       }

    public TestData generateBuildConfig() {
        return TestData.builder()
                .buildType(BuildType.builder()
                        .id(buildId)
                        .name(randomData.getString())
                        .project(Project.builder()
                                .id(id)
                                .build())
                        .parameters(Properties.builder()
                                .property(List.of(Property.builder()
                                        .name("myBuildParameter")
                                        .value("myValue")
                                        .build()))
                                .build())
                        .steps(Steps.builder()
                                .step(List.of(Step.builder()
                                        .name("myCommandLineStep")
                                        .type("simpleRunner")
                                        .properties(propertiesGenerator.getBasicStepProp())
                                        .build()))
                                .build())
                        .build())
                .build();
    }

    public TestData build() {
        return TestData.builder()
                .build(Build.builder()
                        .buildType(BuildType.builder()
                                .id(buildId)
                                .build())
                        .build())
                .build();
    }


}
