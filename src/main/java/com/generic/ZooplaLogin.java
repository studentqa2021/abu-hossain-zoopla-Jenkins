package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.util.BaseConfig;
import com.util.HighLighter;
import com.util.ScreenShot;

public class ZooplaLogin {
	public MasterPageFactory getLogin(WebDriver driver) {

		MasterPageFactory obj = new MasterPageFactory(driver);

//		HighLighter.getColor(driver, obj.getCookiesbtn());
//		if (obj.getCookiesbtn().size()>0) {
//			HighLighter.getColor(driver, obj.getCookiesbtn().get(0));
//			obj.getCookiesbtn().get(0).click();
//
//		}
		//obj.getCookiesbtn().click();
		HighLighter.getColor(driver, obj.getCookiesbtn());
		if (obj.getCookiesbtn().isDisplayed()) {
			HighLighter.getColor(driver, obj.getCookiesbtn());
			obj.getCookiesbtn().click();

		}
		
		
		ScreenShot.getScreenShot(driver, "Home Page");
		HighLighter.getColor(driver, obj.getSinginbtn());
		obj.getSinginbtn().click();

		HighLighter.getColor(driver, obj.getUsername());
		obj.getUsername().sendKeys(BaseConfig.getConfigFile("user"));

		HighLighter.getColor(driver, obj.getPassword());
		obj.getPassword().sendKeys(BaseConfig.getConfigFile("pass"));

		HighLighter.getColor(driver, obj.getFinalsinginbtn());
		ScreenShot.getScreenShot(driver, "Before final Sign in");
		
//		HighLighter.getColor(driver, obj.getCookiesbtn());
//		if (obj.getCookiesbtn().isDisplayed()) {
//			HighLighter.getColor(driver, obj.getCookiesbtn());
//			obj.getCookiesbtn().click();
//
//		}
//		
		obj.getFinalsinginbtn().click();
		ScreenShot.getScreenShot(driver, "After final Sign in");
		
		

		HighLighter.getColor(driver, obj.getMyzoopla());
		Actions ac = new Actions(driver);
		ac.moveToElement(obj.getMyzoopla()).perform();
		ScreenShot.getScreenShot(driver, "After my zoopla mouse hover");

//		// obj.getSingoutbtn().click();
//if(obj.getSingoutbtn().isDisplayed()) {
//	System.out.println("Login passed");
//	Assert.assertTrue(obj.getSingoutbtn().isDisplayed());
//}else {
//	System.out.println("Login failed");
//	Assert.assertTrue(obj.getSingoutbtn().isDisplayed());
//}
//	
		

		return obj;
	}
}