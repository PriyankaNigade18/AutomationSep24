package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*
 * one scenario: tags="@Sellpage"
 * multiple run: or / tags="@Regression"
 * one scenario skip: tags="not @Sellpage"
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue="stepdef",tags="not @Sellpage",publish=true)
public class AmazonRunner {

}
