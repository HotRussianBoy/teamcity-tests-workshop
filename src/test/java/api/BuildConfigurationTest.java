package api;
import org.testng.annotations.Test;
import org.workshop.api.models.Property;
import org.workshop.api.requests.CheckedRequest;

import java.util.ArrayList;


public class BuildConfigurationTest extends BaseTest {
    @Test
    public void buildConfigurationTest() {
        var testData = testDataGenerator;

        var createdProject = new CheckedRequest().createProject(testData.generateProject().getNewProjectDescription());
        var createdVCS = new CheckedRequest().createVCS(testData.generateVCS().getVcsRoot());


    }
}
