package com.syntax.class07_HWCW;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
	
	public static String url = "https://demoqa.com/browser-windows";
	
	public static void main(String[] args) {
		
//		Go to https://demoqa.com/browser-windows
//		click on New Tab and print the text from new tab in the console
//		click on New Window and print the text from new window in the console
//		click on New Window Message and print the text from new window in the console
//		Verify the title is displayed
//		Print out the title of the main page
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String mainPage = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindow: allWindowHandles) {
			driver.switchTo().window(currentWindow);
		}
		
		WebElement tabText = driver.findElement(By.id("sampleHeading"));
		System.out.println("The text says: " + tabText.getText());
		driver.switchTo().window(mainPage);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		newWindow.click();
		
		Set<String> allWindowHandles1 = driver.getWindowHandles();
		for (String currentWindow: allWindowHandles1) {
			driver.switchTo().window(currentWindow);
		}
		
		WebElement newWindowText = driver.findElement(By.id("sampleHeading"));
		System.out.println("The text says: " + newWindowText.getText());
		driver.switchTo().window(mainPage);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement newWindowMessage = driver.findElement(By.id("messageWindowButton"));
		newWindowMessage.click();
		
		Set<String> allWindowHandles2 = driver.getWindowHandles();
		for (String currentWindow : allWindowHandles2) {
			driver.switchTo().window(currentWindow);
		}
		
//		WebElement newWindowText2 = driver.findElement(By.xpath("/html/body"));
//		System.out.println("The text says: " + newWindowText2.getText());
		driver.switchTo().window(mainPage);
		
		
		WebElement title = driver.findElement(By.xpath("//img[@src = '/images/Toolsqa.jpg']"));
		boolean isTitleDisplayed = title.isDisplayed();
		System.out.println("The title is displayed: " + isTitleDisplayed);
		
		System.out.println(driver.getTitle());
		
	
		
	}

}
