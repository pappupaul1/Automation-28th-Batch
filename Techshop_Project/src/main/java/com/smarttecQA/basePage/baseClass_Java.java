package com.smarttecQA.basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass_Java {
	
	public static void setup () {
		
	  //WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
	WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
		
		//System.setProperty("webdriver", "");
		
	}
	
	public static void main(String[] args) {
		baseClass_Java.setup();
		
	}

}
