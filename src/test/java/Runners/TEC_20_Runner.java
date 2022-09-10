package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/TEC_20.feature"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/reports/TEC20.html"}

)

public class TEC_20_Runner extends AbstractTestNGCucumberTests {
}
