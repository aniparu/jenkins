package org.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sample.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooksclass extends BaseClass {

	@Before(order = 3)
	public void precondition1() {
		browerLaunch();
		System.out.println("To launch trhe browser");

	}

	@Before(order = 4)
	public void precondition2() {
		browserMax();
		System.out.println("To max the browser");
	}

	// each Scenario execute

	@After(order=7)
	public void postCondion2(Scenario s) {
		if (s.isFailed()) {  //returns true when scenario is getting failed
			TakesScreenshot  ts = (TakesScreenshot)driver;
			byte[] y = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(y, "image/png");
			//System.out.println("Failed Scenario Name :"+s.getName());
			
			
		}
		

	}


}
