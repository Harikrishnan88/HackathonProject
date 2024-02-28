package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {".//featurefile/InterestRate.feature"},
	glue= {"stepDefinition"},
	plugin = {"pretty","html:reports/myreport.html"
	}
)

public class TestRunner {

}
