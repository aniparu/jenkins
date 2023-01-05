package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@C:\\Users\\anipa\\eclipse-workspace\\Cucumber6.30Batch\\src\\test\\resources\\Failed.txt",
glue="org\\stepdefinition",monochrome=true)
public class TestRerunner {

}
