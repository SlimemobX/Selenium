package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAmazonDD {
	
	public static String url = "http://amazon.com";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

 		WebDriver driver = new ChromeDriver();
 		driver.get(url);
 		
 		WebElement categories = driver.findElement(By.id("searchDropdownBox"));
 		
 		Select select = new Select(categories);
 		
 		List<WebElement> options = select.getOptions();
 		
 		options.size();
 		
 		for(WebElement opt : options) {
 			String text = opt.getText();
 			System.out.println(text);
 		}
 		
 		select.selectByValue("search-alias=alexa-skills");
 		
 		
 		
 		
		
	}

}
