package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	
	public static void createJvmReport(String jsonfilePath) {
		//1.Mention the target folder location
        File  f = new File("C:\\Users\\anipa\\eclipse-workspace\\Cucumber6.30Batch\\JVMReport");
        
        //2.Add details to the report using Configuration class   ---addClassification--->method
       Configuration   c = new Configuration(f, "Facebook &Amazon");
       c.addClassifications("Platform Name", "windows");
       c.addClassifications("platform version", "10");
       c.addClassifications("Brwser Name:", "chrome");
       c.addClassifications("browser version", "106.65");
       c.addClassifications("Sprint No", "3");
       
       //3.Add json file paths into List<String>
        List<String>  li = new LinkedList<String>();
        li.add(jsonfilePath);
        
        //4.Create object for ReportBuilder class and using the created object call generateReports() method.
        ReportBuilder   r = new ReportBuilder(li, c);
        r.generateReports();
        
        
        
        
        
       

	}

}
