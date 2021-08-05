package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true,plugin = { "pretty",
		"html:target/site/cucumber-pretty",
		"rerun:target/rerun.txt",
		"json:target/cucumber.json",
		},

		features = { "./src/test/resources/Login.feature" }, 
		glue = { "com.stepdef" }, // package name
		monochrome = true //dryRun = false, strict = true
		// ,tags= {"@Function"}

)


public class Runner extends AbstractTestNGCucumberTests {
	
	

}
