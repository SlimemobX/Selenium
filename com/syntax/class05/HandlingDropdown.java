package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropdown {
	
	public static String url = "http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html";
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

 		WebDriver driver = new ChromeDriver();
 		driver.get(url);
 		
 		WebElement daysDD = driver.findElement(By.id("select-demo"));
 		Select days = new Select(daysDD);
 		
// 		// selecting by Index
// 		days.selectByIndex(2);
// 		
// 		
// 		Thread.sleep(3000);
// 		
//		// selecting by VisibleText
// 		days.selectByVisibleText("Friday");
// 		
// 		Thread.sleep(3000);
// 		
// 		// selecting by value
// 		days.selectByValue("Sunday");
 		
 		List<WebElement> options = days.getOptions();
 		int size = options.size();
 		System.out.println(size);
 		
 		for (int i = 0; i < size; i++) {
 			days.selectByIndex(i);
 			Thread.sleep(3000);
 			
 		}
 		
		
		
	}

}
