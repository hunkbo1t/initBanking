package com.banking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	WebDriver driver;
	
	public LoginPageObjects (WebDriver RemDriver) {
		driver = RemDriver;
		PageFactory.initElements(RemDriver,this);
	}		
		@FindBy(name = "uid")
		WebElement userName;
		
		@FindBy(name = "password")
		WebElement password;
		
		@FindBy(name = "btnLogin")
		WebElement login;

	
	public void enterUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void loginClick() {
		login.click();
	}
}
