package com.testexecute;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.DriverManager;
import com.generic.ZooplaLogin;

public class TestngSmokeReport {
	static ExtentReports extent;
	static ExtentTest test;
	static WebDriver driver;
	@BeforeClass
	public static void startTest() {
		ExtentSparkReporter repoter = new ExtentSparkReporter("target/ExtentsTestNGZooplaSigninReport.html");
		repoter.config().setDocumentTitle("Final Automation Zoopla");
		repoter.config().setReportName("Smoke Test");
		repoter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name:", System.getProperty("user.name"));
		 driver=new DriverManager().getDriver(); 

	}
	@Test
	public void smoke() {
		 test=extent.createTest("Smoke");
		new ZooplaLogin().getLogin(driver);
	}
	@AfterTest
	public void teardown() {
		//driver.quit();
		extent.flush();
	}
}
