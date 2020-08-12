package com.syntax.class05_HWCW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
//	HW1
//	Go to facebook sign up page
//	Fill out the whole form
//	Click signup
	
	public static String url = "https://www.facebook.com/r.php";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.name("firstname")).sendKeys("Blake");
		driver.findElement(By.name("lastname")).sendKeys("Ryan");
		driver.findElement(By.cssSelector("input[name = 'reg_email__']")).sendKeys("BlakeRyan90234@Yahoo.com");
		driver.findElement(By.cssSelector("input[name = 'reg_email_confirmation__']")).sendKeys("BlakeRyan90234@Yahoo.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("$BlKryn9843582");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		
		months.selectByIndex(7);
		days.selectByVisibleText("3");
		years.selectByValue("1983");
		
		List<WebElement> radioBtn = driver.findElements(By.xpath("//input[@name = 'sex']"));
 		for(WebElement button : radioBtn) {
 			if(button.isEnabled()) {
 				String value = button.getAttribute("value");
 				if (value.equals("2")) {
 					button.click();
 					Thread.sleep(2000);
 					break;
 				}
 			}
 		}
		
		
		driver.findElement(By.cssSelector("button[name = 'websubmit']")).click();
		
		
		
	}

}
