package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
@FindBy(xpath = "(//*[contains(text(),'Accept all cookies')])[2]")	
private WebElement cookiesbtn;
@FindBy(xpath = "(//*[contains(@class,'css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0')])[4]")
private WebElement singinbtn;
@FindBy(xpath = "//*[contains(@name,'email')]")
private WebElement username;
@FindBy(xpath = "//*[contains(@id,'input-password')]")
private WebElement password;
@FindBy(xpath = "(//*[contains(text(),'Sign in')])[10]")
private WebElement finalsinginbtn;
@FindBy(xpath = "(//*[contains(text(),'My Zoopla')])[1]")
private WebElement myzoopla;
@FindBy(xpath = "(//*[contains(text(),'Sign out')])[1]")
private WebElement singoutbtn;



public WebElement getCookiesbtn() {
	return cookiesbtn;
}
public WebElement getSinginbtn() {
	return singinbtn;
}
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getFinalsinginbtn() {
	return finalsinginbtn;
}

public WebElement getMyzoopla() {
	return myzoopla;
}
public WebElement getSingoutbtn() {
	return singoutbtn;
}
}
