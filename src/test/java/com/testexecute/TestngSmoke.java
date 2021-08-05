package com.testexecute;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.DriverManager;
import com.generic.MasterPageFactory;
import com.generic.ZooplaLogin;

public class TestngSmoke {
	WebDriver driver;
	MasterPageFactory obj;
	@BeforeTest
	public void getSetup() {
		driver = new DriverManager().getDriver();
	}

	@Test
	public void getLogin() {
	obj=new ZooplaLogin().getLogin(driver);
	Assert.assertTrue(obj.getSingoutbtn().isDisplayed(),"Login Test Passed");
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
