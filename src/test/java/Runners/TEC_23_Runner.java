package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/TEC_23.feature"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/reports/TEC_23.html"}
)
public class TEC_23_Runner extends AbstractTestNGCucumberTests {
}
