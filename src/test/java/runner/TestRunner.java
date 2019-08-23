package runner;

import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features/login.feature"},
        glue = {"Steps"},
        tags = {"@login"},
        monochrome = true,
        plugin = {"json:target/cucumber.json"}
)
public class TestRunner extends  AbstractTestNGCucumberTests{
}
