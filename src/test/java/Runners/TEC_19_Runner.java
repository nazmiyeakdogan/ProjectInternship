package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/TEC_19.feature"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/reports/TEC19.html"}

)

public class TEC_19_Runner extends AbstractTestNGCucumberTests {
}
