package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver; // global variable

	public static WebDriver browerLaunch() { // local variable
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public static void edgeBrowserLaunch() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void browserMax() {
		driver.manage().window().maximize();

	}

	public static void passTxt(WebElement element, String txt) {
		element.sendKeys(txt);

	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static String pageTittle() {
		String t = driver.getTitle();
		return t;

	}

	public static String pageUrl() {
		String h = driver.getCurrentUrl();
		return h;
	}

	public static void closeTheBrowser() {
		driver.close();

	}

	public static void dragAndDrapTheWeb(WebElement from, WebElement to) {
		Actions a = new Actions(driver);

		a.dragAndDrop(from, to).perform();

	}

	public static void navigateCmd(String url) {
		driver.navigate().to(url);

	}

	public static void screenShot(String book) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		// folderpath//filename.fileextensions
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenProject6PmBatch\\ScreenShot\\" + book + ".png");

		FileUtils.copyFile(source, f);

	}

	public static String readExcel(String newSheet, int numRow, int numCell) throws IOException {
		// to read the given excel sheet

		// To create new File
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenProject6PmBatch\\Excel\\6PMFastrack.xlsx");

		// to read a file
		FileInputStream fis = new FileInputStream(f);

		// to raed exact file format
		Workbook w = new XSSFWorkbook(fis);

		// workbook--->sheet---->row--->cell--->data

		// to get the sheet from work
		Sheet mySheet = w.getSheet(newSheet);

		String value = "";

		Row myRow = mySheet.getRow(numRow);

		Cell myCell = myRow.getCell(numCell);

		int c = myCell.getCellType();

		if (c == 1) {

			value = myCell.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(myCell)) {
			Date dd = myCell.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			value = sdf.format(dd);

		} else {
			double d = myCell.getNumericCellValue();
			long l = (long) d;
			value = String.valueOf(l);

		}

		return value;

	}

	public static void writeExcel(String mySheet, int numRow, int numCell) throws IOException {
		// to write a excel sheet
		// folderpath\\filename.exte
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenProject6PmBatch\\Excel\\newFile.xlsx");

		Workbook w = new XSSFWorkbook();

		// to create a sheet
		Sheet sh = w.createSheet(mySheet);

		// to create new row
		Row newRow = sh.createRow(numRow);

		// to create new cell
		Cell newCell = newRow.createCell(numCell);

		newCell.setCellValue("Data driven");

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("done.....");

	}

	public static void createCellOnly(String mySheet, int numRow, int numCell, String newvalue) throws IOException {
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenProject6PmBatch\\Excel\\newFile.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		// to create a sheet
		Sheet sh = w.getSheet(mySheet);

		// to create new row
		Row newRow = sh.getRow(numRow);

		// to create new cell
		Cell newCell = newRow.createCell(numCell);

		newCell.setCellValue(newvalue);

		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("done.....");

	}

	public static void createRowOnly(String mySheet, int numRow, int numCell, String newvalue) throws IOException {
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenProject6PmBatch\\Excel\\newFile.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		// to create a sheet
		Sheet sh = w.getSheet(mySheet);

		// to create new row
		Row newRow = sh.getRow(numRow);

		// to create new cell
		Cell newCell = newRow.getCell(numCell);
		
		
	
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("done.....");

	}
	
	public static void upDateCell(String mySheet,int numRow,int numCell,String currentvalue,String replacevalue) throws IOException {
		File f = new File("C:\\Users\\anipa\\eclipse-workspace\\MavenProject6PmBatch\\Excel\\newFile.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		// to create a sheet
		Sheet sh = w.getSheet(mySheet);

		// to create new row
		Row newRow = sh.getRow(numRow);

		// to create new cell
		Cell newCell = newRow.getCell(numCell);
		
		String value = newCell.getStringCellValue();
		
		if (value.equals(currentvalue)) {
			newCell.setCellValue(replacevalue);
			
		}
		
	
		FileOutputStream fos = new FileOutputStream(f);

		w.write(fos);

		System.out.println("done.....");


	}

}
