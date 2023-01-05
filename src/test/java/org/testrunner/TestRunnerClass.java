package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",
glue = "org\\stepdefinition", 
monochrome = true, 
dryRun = false, 
strict = true, 
snippets = SnippetType.CAMELCASE, 
plugin = {
		"html:target", 
		"json:JsonReport\\JsonRepo.json",
		"junit:JunitReport\\JunitRepo.xml",
		"rerun:src\\test\\resources\\Failed.txt"})
public class TestRunnerClass {
	
	@AfterClass
	public static void report() {
		Report.createJvmReport("C:\\Users\\anipa\\eclipse-workspace\\Cucumber6.30Batch\\JsonReport\\JsonRepo.json");

	}

}
