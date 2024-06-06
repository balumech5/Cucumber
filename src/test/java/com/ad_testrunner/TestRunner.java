package com.ad_testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions 
(features = "src\\test\\java\\com\\adactin\\feature\\ad.feature", 
glue = "com.step")

public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserlaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver. manage().window(). maximize();
		
	}
	@AfterClass
	public static void browserclose() {
		
			driver.close();
	}

}
