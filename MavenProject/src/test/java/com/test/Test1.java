package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	public static WebDriver driver;
	
	@Parameters("sBrowser")
	@BeforeTest 
	public void launchBrowser(String sBrowser) {
		
		if(sBrowser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.get("https://www.google.co.in");
		} else if(sBrowser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://www.google.co.in");
		}
		 
	}
	
  @Test
  public void tc1() {

	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  
  }
  @Test
  public void tc2() {
	  driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	  
  }
}
