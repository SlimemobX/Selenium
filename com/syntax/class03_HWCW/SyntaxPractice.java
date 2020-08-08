package com.syntax.class03_HWCW;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SyntaxPractice {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		
		
		driver.findElement(By.xpath("//a[@id = 'btn_basic_example']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a#btn_inter_example")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[starts-with(text(), 'Input Form')])[5]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name = 'first_name']")).sendKeys("Jade");
		driver.findElement(By.cssSelector("input[name = 'last_name']")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[starts-with(@name, 'em')]")).sendKeys("JSmith09@gmial.com");
		driver.findElement(By.xpath("//input[@name = 'phone']")).sendKeys("(123)456-7890");
		driver.findElement(By.cssSelector("input[placeholder ^= 'Add']")).sendKeys("5959 Black horse ln");
		driver.findElement(By.cssSelector("input[placeholder ^= 'ci']")).sendKeys("Wilmington");
		
		Select state = new Select(driver.findElement(By.xpath("//select[@name = 'state']")));
		state.selectByVisibleText("Delaware");
		
		driver.findElement(By.xpath("//input[@name = 'zip']")).sendKeys("19850");
		driver.findElement(By.cssSelector("input[name = 'website']")).sendKeys("http:www.google.com");
		
		WebElement radio1 = driver.findElement(By.cssSelector("input[value ^= 'yes']"));
		radio1.click();
		Thread.sleep(2000);
		WebElement radio2 = driver.findElement(By.cssSelector("input[value ^= 'no']"));
		radio2.click();
		
		driver.findElement(By.cssSelector("textarea[placeholder ^= 'Project']")).sendKeys("Selenium Practice");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class = 'btn btn-default']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
