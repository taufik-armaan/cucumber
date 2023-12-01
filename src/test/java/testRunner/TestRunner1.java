package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//Features//LoginSample.feature",
		glue={"stepDefinations"},
		
		tags= "@sanity or @regression" ,     // Scenario tagged with sanity
		
				plugin= {"pretty", "html:reports/myreport.html", 
						 "json:reports/myreport.json", 
						 "junit:reports/myreport.xml"}
		
		
		)

public class TestRunner1 {

}
