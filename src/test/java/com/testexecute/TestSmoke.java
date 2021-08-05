package com.testexecute;

import org.openqa.selenium.WebDriver;

import com.generic.DriverManager;
import com.generic.ZooplaLogin;

public class TestSmoke {
public static void main(String[] args) {
	
	WebDriver driver=new DriverManager().getDriver();
	new ZooplaLogin().getLogin(driver);
	driver.quit();
}
}
