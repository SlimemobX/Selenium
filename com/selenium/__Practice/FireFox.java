package com.selenium.__Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("http:www.amazon.com");
		
	}

}
