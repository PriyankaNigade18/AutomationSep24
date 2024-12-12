package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Crm.feature",
					glue={"stepdef","appHooks"},
					plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class CrmRunner {

}
