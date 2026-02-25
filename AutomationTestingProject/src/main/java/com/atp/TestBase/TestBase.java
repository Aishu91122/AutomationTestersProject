package com.atp.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	static WebDriver driver;
	
	public static void setUp()
	{
	driver = new ChromeDriver(); 
	}
	

}
