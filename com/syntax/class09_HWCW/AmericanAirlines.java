package com.syntax.class09_HWCW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmericanAirlines {
	
	public static String url = "http://aa.com/homePage.do";
	
	public static void main(String[] args) throws InterruptedException {
	
//		Go to aa.com/homePage.do
//		select depart date
//		select return date
//		select destination
//		click on search
//		quit the browser
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement clear = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		clear.clear();
		
		// Departure from
		WebElement cityFrom = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		cityFrom.sendKeys("IAD");
		
		// Destination
		WebElement cityTo = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		cityTo.sendKeys("MIA");
		
		// Departure date
		WebElement leave  = driver.findElement(By.id("aa-leavingOn"));
		leave.click();
		
		WebElement dMonth = driver.findElement(By.className("ui-datepicker-month"));
		String departMonth = dMonth.getText();
		String expectedMonth = "September";
		while(!departMonth.equals(expectedMonth)) {
			WebElement next = driver.findElement(By.xpath("//a[@title = 'Next']"));
			next.click();
			dMonth = driver.findElement(By.className("ui-datepicker-month"));
			departMonth = dMonth.getText();
		}
		
		List<WebElement> departDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement departDate : departDates) {
			if(departDate.getText().equals("10")) {
				departDate.click();
				break;
			}
		}
		
		// Return date
		WebElement returnCal = driver.findElement(By.id("aa-returningFrom"));
		returnCal.click();
		
		WebElement rMonth = driver.findElement(By.className("ui-datepicker-month"));
		String returnMonth = rMonth.getText();
		expectedMonth = "December";
		while(!returnMonth.equals(expectedMonth)) {
			WebElement next = driver.findElement(By.xpath("//a[@title = 'Next']"));
			next.click();
			rMonth = driver.findElement(By.className("ui-datepicker-month"));
			returnMonth= rMonth.getText();
		}
		
		List<WebElement> returnDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
		for(WebElement returnDate: returnDates) {
			if(returnDate.getText().equals("23"));
			Thread.sleep(3000);
			returnDate.click();
			break;
		}
		
		
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
		submit.click();
		driver.close();
		
		
		
		
		
	}

}
