package cucumbertestrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features= {"src/main/java/cucumberfeatures/login.feature"},
		dryRun=!true,
		glue="cucumbersteps",
		publish=true,
		snippets=SnippetType.CAMELCASE,
		monochrome=true
		
		)
public class Runner extends AbstractTestNGCucumberTests {

}
