package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =  "C:\\Users\\diyor\\cucumberAutomation\\Automationcucumber\\src\\test\\java\\features\\Techfios.feature",
		glue = "steps",
		tags = "@BothScenarios",
			monochrome = true,
			//dryRun = false,
			plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" })


public class Loginrunner {

}
