package com.syntax.class04_HWCW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static String url = "http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html";
	
	public static void main(String[] args) throws InterruptedException {
		
		// Go to http://166.62.36.207/syntaxpractice/basic-radiobutton-demo.html
		// Select any radiobutton and the age group ---> use List and loop
		// Click on get values
		// Verify the text in the page -- do not hardcode the values and compare
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

 		WebDriver driver = new ChromeDriver();
 		driver.get(url);
 		
 		List<WebElement> radioBtn = driver.findElements(By.xpath("//input[@name = 'optradio']"));
 		for(WebElement button : radioBtn) {
 			if(button.isEnabled()) {
 				String value = button.getAttribute("value");
 				if (value.equals("Male")) {
 					button.click();
 					Thread.sleep(2000);
 					break;
 				}
 			}
 		}
 		
 		WebElement getCheckValues = driver.findElement(By.xpath("//button[@id = 'buttoncheck']"));
 		getCheckValues.click();
 		
 		WebElement checkText = driver.findElement(By.xpath("//p[@class = 'radiobutton']"));
 		if(checkText.isDisplayed()) {
 			String message = checkText.getText();
 			if (message.equals("Radio button 'Male' is checked")) {
 				System.out.println("The message is correct");
 			}else {
 				System.out.println("The message is wrong");
 			}
 		}
 		
 		List<WebElement> groupGender = driver.findElements(By.xpath("//input[@name = 'gender']"));
 		for(WebElement sex : groupGender) {
 			if(sex.isEnabled()) {
 				String group = sex.getAttribute("value");
 				if (group.equals("Female")) {
 					sex.click();
 					Thread.sleep(2000);
 					break;
 				}
 			}
 		}
 		
 		List<WebElement> groupAge = driver.findElements(By.xpath("//input[@name = 'ageGroup']"));
 		for(WebElement btn : groupAge) {
 			if(btn.isEnabled()) {
 				String age = btn.getAttribute("value");
 				if (age.equals("5 - 15")) {
 					btn.click();
 					Thread.sleep(2000);
 					break;
 				}
 			}
 		}
 		
 		WebElement getValues = driver.findElement(By.xpath("//button[text() = 'Get values']"));
 		getValues.click();
 		
 		WebElement checkText2 = driver.findElement(By.xpath("//p[@class = 'groupradiobutton']"));
 		if(checkText2.isDisplayed()) {
 			String message2 = checkText2.getText();
 			if (message2.contains("Sex : Female") && message2.contains("Age group: 5 - 15")) {
 				System.out.println("The message is correct");
 			}else {
 				System.out.println("The message is wrong");
 			}
 		}
		
		
	}

}
