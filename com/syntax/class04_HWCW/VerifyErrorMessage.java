package com.syntax.class04_HWCW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
	public static void main(String[] args) {
		
		// HRMS Application Negative Login:
		//	Open chrome browser
		//	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
		//	Enter valid username
		//	Leave password field empty
		//	Verify error message with text “Password cannot be empty” is displayed.
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

 		WebDriver driver = new ChromeDriver();
 		driver.get(url);
 		
 		WebElement username = driver.findElement(By.id("txtUsername"));
 		username.sendKeys("Admin");
 		
 		WebElement login = driver.findElement(By.name("Submit"));
 		login.click();
 		
 		WebElement checkText = driver.findElement(By.xpath("//span[@id = 'spanMessage']"));
 		if(checkText.isDisplayed()) {
 			String message = checkText.getText();
 			if (message.equals("Password cannot be empty")) {
 				System.out.println("The message is correct");
 			}else {
 				System.out.println("The message is wrong");
 			}
 		}
 				
		
	}

}
