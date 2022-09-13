package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/TEC_24.feature"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/reports/TEC_24.html"}
)
public class TEC_24_Runner extends AbstractTestNGCucumberTests {
}
