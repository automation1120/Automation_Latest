package com.infofactors.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers_Launch
{

	public static void main(String[] args) {
		
		 // System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\Launching_Browsers_Latest\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		  
		  driver.get("https://www.seleniumhq.org/download/");
		  
		
	}
}
