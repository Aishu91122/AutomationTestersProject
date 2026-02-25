package com.atp.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	static WebDriver driver;
	
	public static void setUp(String browserName)
	{
	 
	if (browserName.equalsIgnoreCase("chrome"))
		 
	{
	 
	driver = new ChromeDriver();
	 
	}
	 
	
	

}
