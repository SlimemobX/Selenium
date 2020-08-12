package com.syntax.class05_HWCW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayCategories {
//	HW2
//	Go to ebay.com
//	get all the categories and print them in the console
//	select Computers/Tables & Networking
//	click on search
//	verify the header
	
	
	
	public static String url = "https://www.facebook.com/r.php";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		
	}

}
