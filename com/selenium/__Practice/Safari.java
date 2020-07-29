package com.selenium.__Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {
	public static void main(String[] args) {
		
System.setProperty("webdriver.safari.driver", "safari");
		
		WebDriver driver3 = new SafariDriver();
		
		driver3.get("http:www.amazon.com");
	}

}
