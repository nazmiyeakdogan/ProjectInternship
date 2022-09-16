package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/FeatureFiles/TEC-14.feature","src/test/java/FeatureFiles/TEC_15.feature",
                "src/test/java/FeatureFiles/TEC_19.feature", "src/test/java/FeatureFiles/TEC_20.feature", "src/test/java/FeatureFiles/TEC_21.feature",
                "src/test/java/FeatureFiles/TEC_22.feature", "src/test/java/FeatureFiles/TEC_23.feature", "src/test/java/FeatureFiles/TEC_24.feature",
                "src/test/java/FeatureFiles/TEC_25.feature", "src/test/java/FeatureFiles/TEC_26.feature"},

        glue = {"StepDefinitions"},
        plugin = {"html:target/reports/Proje_Runner.html"}
)

public class Proje_Runner extends AbstractTestNGCucumberTests {

}
