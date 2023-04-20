package api;

import org.testng.annotations.Test;
import org.workshop.api.requests.CheckedRequest;


public class BuildConfigurationTest extends BaseTest {
    @Test
    public void buildConfigurationTest() {
        var testData = testDataGenerator;

        var createdProject = new CheckedRequest().createProject(testData.generateProject().getNewProjectDescription());
        var createdVCS = new CheckedRequest().createVCS(testData.generateVCS().getVcsRoot());
        var createBuildConfig = new CheckedRequest().createBuildType(testData.generateBuildConfig().getBuildType());

        var runBuild = new CheckedRequest().runBuild(testData.build().getBuild());
       // var checkBuildFinished = new CheckedRequest().waitBuildFinished(runBuild.getId());
    }
}

