package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test2 {
	
  @Test
  public void tc3() {
	  Test1.driver.findElement(By.linkText("Downloads - Selenium")).click();
	  
  }
}
