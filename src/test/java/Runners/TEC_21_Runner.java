package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/TEC_21.feature"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/reports/TEC21.html"}
)

public class TEC_21_Runner extends AbstractTestNGCucumberTests {}
