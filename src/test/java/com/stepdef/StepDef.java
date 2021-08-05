package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.DriverManager;
import com.generic.MasterPageFactory;
import com.generic.ZooplaLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
WebDriver driver;
MasterPageFactory obj;
@Given ("Open browser & go to zoopla URL")
public void getSetup() {
	driver = new DriverManager().getDriver();	
}
@When ("try to login with credential")
public void getLogin() {
	obj=new ZooplaLogin().getLogin(driver);	
}
@Then ("validate login was success")
public void getValidation() {
	Assert.assertTrue(obj.getSingoutbtn().isDisplayed(),"Login Test Passed");
	driver.quit();
}
}
