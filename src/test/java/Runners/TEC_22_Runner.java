package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/TEC_22.feature"},
        glue = {"StepDefinitions"},
        plugin = {"html:target/reports/TEC22.html"}

)

public class TEC_22_Runner extends AbstractTestNGCucumberTests {}