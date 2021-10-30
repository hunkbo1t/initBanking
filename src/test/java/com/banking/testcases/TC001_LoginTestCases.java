package com.banking.testcases;

import java.io.IOException;

import org.testng.Assert;
import com.banking.pageObject.LoginPageObjects;

public class TC001_LoginTestCases extends BaseClass {
	@org.testng.annotations.Test
	public void loginTest() throws IOException{
		driver.get(baseUrl);
		Log.info("Url Launched");
		
		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.enterUserName(username);
		Log.info("Username entered");
		
		lp.enterPassword(password);
		Log.info("Password entered");
		
		lp.loginClick();
		Log.info("Clicked on login button");
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			Assert.assertTrue(true);
			Log.info("Test case passed");
		}else {
			Log.info("Test case failed");
		}
		
	}
}
