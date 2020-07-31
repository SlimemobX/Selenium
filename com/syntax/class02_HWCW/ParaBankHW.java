package com.syntax.class02_HWCW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankHW {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
		driver.findElement(By.name("customer.firstName")).sendKeys("Irwin");
		driver.findElement(By.name("customer.lastName")).sendKeys("Ferrufino");
		driver.findElement(By.id("customer.address.street")).sendKeys("8724 BlackWater rd");
		driver.findElement(By.id("customer.address.city")).sendKeys("Annandale");
		driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("22003");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("5710938433");
		driver.findElement(By.id("customer.ssn")).sendKeys("847750000");
		
		
		driver.findElement(By.name("customer.username")).sendKeys("Steelers7");
		driver.findElement(By.name("customer.password")).sendKeys("Slimemob5");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Slimemob5");
		driver.findElement(By.className("button")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	}

}
