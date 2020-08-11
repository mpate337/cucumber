package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\marmi\\eclipse-workspace\\Cucumber\\src\\main\\java\\Features\\search.feature",
		glue = {"step_def"},
		monochrome = true, //output in readable format
		dryRun = false, //to map feature with step def file
		strict = true, //to check if all steps are defined in step def file
		plugin = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_output/cucumber.xml"}
		)

public class TestRunner {

}
