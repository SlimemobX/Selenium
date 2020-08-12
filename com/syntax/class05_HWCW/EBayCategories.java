package com.syntax.class05_HWCW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EBayCategories {
//	HW2
//	Go to ebay.com
//	get all the categories and print them in the console
//	select Computers/Tables & Networking
//	click on search
//	verify the header
	
	
	
	public static String url = "https://www.ebay.com/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		
		WebElement categories = driver.findElement(By.id("gh-cat"));
		
		Select select = new Select(categories);
		
		List<WebElement> options= select.getOptions();
		
		for(WebElement opt : options) {
			String text = opt.getText();
			System.out.println(text);
		}
		
		select.selectByValue("58058");
		
		driver.findElement(By.cssSelector("input[class = 'btn btn-prim gh-spr']")).click();
		
		System.out.println();
		
		WebElement header = driver.findElement(By.xpath("//span[text() = 'Computers, Tablets & Network Hardware']"));
 		if(header.isDisplayed()) {
 			String headerText = header.getText();
 			if(headerText.equals("Computers, Tablets & Network Hardware")) {
 				System.out.println("The header is CORRECT");
 			} else {
 				System.out.println("The header is WRONG");
 			}
 		} 
		
		
	}

}
