package com.test;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class CustomListner extends TestListenerAdapter {
  
	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test case pass :::" +tr.getName());
		
	}
	
	@Override
	public void onTestFailure(ITestResult tr) {
        File scrFile = ((TakesScreenshot)Test1.driver).getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(scrFile, new File("..//MavenProject//target/"+tr.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
