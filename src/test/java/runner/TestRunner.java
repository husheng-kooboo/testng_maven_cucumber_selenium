package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/login.feature"},
        glue = {"Steps"},
        tags = {"@login"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
