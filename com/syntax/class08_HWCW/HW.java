package com.syntax.class08_HWCW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW {
	
	public static String url = "https://the-internet.herokuapp.com/dynamic_controls";
	
	public static void main(String[] args) {
		
//		go to https://the-internet.herokuapp.com/dynamic_controls
//		click on checkbox and click on remove
//		verify the text
//		click on enable verify the textbox is enabled
//		enter text and click disable
//		verify the textbox is disabled
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement checkBox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
		checkBox.click();
		
		WebElement removeBtn = driver.findElement(By.xpath("//button[contains(text(), 'Remove')]"));
		removeBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id = 'message']")));
		
		WebElement text = driver.findElement(By.xpath("//p[@id = 'message']"));
		String verifyText = text.getText();
		System.out.println(verifyText);
		
		// enabled
		WebElement enableBox = driver.findElement(By.xpath("//button[contains(text(),'Enable')]"));
		enableBox.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver,20);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id = 'message']")));
		
		WebElement text2 = driver.findElement(By.xpath("//p[@id = 'message']"));
		String verifyText2 = text2.getText();
		System.out.println(verifyText2);
		
		// enter text
		WebElement enterText = driver.findElement(By.xpath("//input[@type = 'text']"));
		enterText.sendKeys("Enter");
		
		// disabled
		WebDriverWait wait3 = new WebDriverWait(driver,20);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(), 'Disable')]")));
		
		WebElement disableBox = driver.findElement(By.xpath("//button[contains(text(),'Disable')]"));
		disableBox.click();
		
		WebDriverWait wait4 = new WebDriverWait(driver,20);
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'disabled')]")));
		
		WebElement text3 = driver.findElement(By.xpath("//p[contains(text(), 'disabled')]"));
		String verifyText3 = text3.getText();
		System.out.println(verifyText3);
		
		
	}

}
