package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/appfeatures/",
        glue= "steps"
)
public class Runner extends AbstractTestNGCucumberTests {
}
