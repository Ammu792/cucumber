package com.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mmaha\\OneDrive\\Desktop\\mahalakshmi\\mavencucumber\\src\\test\\java\\ada\\feature\\Cucumber.feature"
,glue="com.stepde")
public class Runner_class {
	public static WebDriver driver;
	static WebDriverWait wait;
	@BeforeClass
public static  void launch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 wait=new WebDriverWait(driver,30);
	
}
	@AfterClass
	public static void close() {
		if (driver!=null) {
			
		}
//		driver.close();
	}
}
