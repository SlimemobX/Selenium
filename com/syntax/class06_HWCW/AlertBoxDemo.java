package com.syntax.class06_HWCW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {
	
	public static String url = "http://166.62.36.207/syntaxpractice/javascript-alert-box-demo.html";
	
	public static void main(String[] args) throws InterruptedException {
	
//	Go to http://166.62.36.207/syntaxpractice/javascript-alert-box-demo.html
//	click on each button and handle the alert accordingly
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		
		WebElement alertButton = driver.findElement(By.xpath("//button[@class = 'btn btn-default']"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
		
		
		WebElement confirmButton = driver.findElement(By.xpath("(//button[@class = 'btn btn-default btn-lg'])[1]"));
		confirmButton.click();
		Thread.sleep(3000);
		alert.dismiss();
		
		
		WebElement promptButton = driver.findElement(By.xpath("(//button[@class = 'btn btn-default btn-lg'])[2]"));
		promptButton.click();
		Thread.sleep(3000);
		
		alert.sendKeys("Irwin");
		Thread.sleep(3000);
		alert.accept();

	}	
		
}
