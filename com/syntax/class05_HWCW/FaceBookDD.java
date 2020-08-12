package com.syntax.class05_HWCW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDD {
	
//	TC 1: Facebook dropdown verification
//	Open chrome browser
//	Go to “https://www.facebook.com”
//	Verify:
//	month dd has 12 month options
//	day dd has 31 day options
//	year dd has 115 year options
//	Select your date of birth	
//	Quit browser

	public static String url = "https://www.facebook.com/r.php";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		
		List<WebElement> monthOpt = months.getOptions();
		int size = monthOpt.size();
		System.out.println(size);
		
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		
		List<WebElement> dayOpt = days.getOptions();
		int size2 = dayOpt.size();
		System.out.println(size2);
		
		
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		
		List<WebElement> yearOpt = years.getOptions();
		int size3 = yearOpt.size();
		System.out.println(size3);
		
		
		months.selectByValue("9");
		days.selectByVisibleText("10");
		years.selectByValue("1992");
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
