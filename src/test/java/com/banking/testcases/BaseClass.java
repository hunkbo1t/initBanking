package com.banking.testcases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeGroups;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	public static final Logger Log = LogManager.getLogger(BaseClass.class.getName());
	
	public String baseUrl = "http://demo.guru99.com/V1/index.php";
	public String password =  "gaherUh";
	public String username = "mngr359944";
	public static WebDriver driver;
	
	@BeforeGroups
	private void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Log.info("Driver instantiatated");
	}
	
	@org.testng.annotations.AfterClass
	public void tearDown() {
		driver.quit();
	}

}

	