import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/resources/features",
        plugin = {"pretty"})
public class TestRunnerAbstract extends AbstractTestNGCucumberTests {
}
