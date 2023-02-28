package testRuns;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 

@RunWith(Cucumber.class)


@CucumberOptions(
		
		features= {"@target/failed_Sceanrios.txt"},
		 
		glue= {"stepDefinitions","hooks"},
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = false,
		monochrome=true
		
		
		
		
		)


public class FailedTestRunner   {

}
