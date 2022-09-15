package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/TEC_26.feature"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/reports/TEC_26Report.html"}

)


public class TEC_26_Runner extends AbstractTestNGCucumberTests {
}
