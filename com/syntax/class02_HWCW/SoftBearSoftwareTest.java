package com.syntax.class02_HWCW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoftBearSoftwareTest {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fdefault.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		driver.findElement(By.className("button")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Web Orders";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("The title is right");
		}else {
			System.out.println("The title is wrong");
		}
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Logout")).click();
		driver.quit();
	}

}
