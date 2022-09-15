package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/TEC_25.feature"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/reports/TEC_25Report.html"}

)


public class TEC_25_Runner extends AbstractTestNGCucumberTests {
}
