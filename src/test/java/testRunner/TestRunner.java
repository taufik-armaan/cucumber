package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//Features//LoginSample.feature",
		glue={"stepDefinations"},
		//features="@target/rerun.txt", // it will run only failures test cases/scenarios

		plugin= {"pretty", "html:reports/myreport.html", 
				 "json:reports/myreport.json", 
				 "junit:reports/myreport.xml"
				 //"rerun:target/rerun.txt",   // this plugin is mandatory to captures
			 },
		dryRun=false,  // when set to "true" then it will just check all the methods implemented or not in stepDefination file as per the steps in feature file
		monochrome =false , // this is used to remove junk special characters in the console
		tags= "@sanity"      // Scenario tagged with sanity
		
		
		)

public class TestRunner {

}
