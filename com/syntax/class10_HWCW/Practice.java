package com.syntax.class10_HWCW;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static String url = "https://artoftesting.com/samplesiteforselenium";

	public static void main(String[] args) throws InterruptedException {

		// https://artoftesting.com/samplesiteforselenium

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// Getting Text
		WebElement text = driver.findElement(By.xpath("//p[(text() = 'This is sample text!')]"));
		System.out.println(text.getText());

		// Clicking on link
		WebElement link = driver.findElement(By.linkText("This is a link"));
		link.click();

		// Window Handling
		String mainPageHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> it = allWindowHandles.iterator();
		mainPageHandle = it.next();
		String childHandle = it.next();
		Thread.sleep(1000);
		driver.switchTo().window(mainPageHandle);

		// Inputting Textbox
		WebElement inText = driver.findElement(By.name("firstName"));
		inText.sendKeys("Irwin");

		// Submit Button
		WebElement submit = driver.findElement(By.xpath("//button[@id = 'idOfButton']"));
		submit.click();

		// Double Click And Alert
		WebElement dblClick = driver.findElement(By.id("dblClkBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(dblClick).perform();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Radio Button
		List<WebElement> radioBtn = driver.findElements(By.cssSelector("input[id = 'male']"));
		for (WebElement button : radioBtn) {
			if (button.isEnabled()) {
				String value = button.getAttribute("value");
				if(value.equals("male")) {
					button.click();
					break;
				}

			}

		}
		
		// Check Boxes
		List<WebElement> optionCheckBoxes = driver.findElements(By.xpath("//input[@class = 'Automation']"));
		for (WebElement checkBoxes: optionCheckBoxes) {
			if(checkBoxes.isEnabled()) {
				String checkBox = checkBoxes.getAttribute("value");
				if(checkBox.equals("Automation")) {
					checkBoxes.click();
					break;
				}
			}
		}
		
		// Drop Down
		WebElement test = driver.findElement(By.id("testingDropdown"));
		Select tests = new Select(test);
		tests.selectByVisibleText("Database Testing");
		
		// Alert
		WebElement alertBox = driver.findElement(By.xpath("//button[@onclick = 'if (!window.__cfRLUnblockHandlers) return false; generateAlertBox()']"));
		alertBox.click();
		Thread.sleep(5000);
		alert.accept();
		
		
		// ComfirmAlert
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick = 'if (!window.__cfRLUnblockHandlers) return false; generateConfirmBox()']"));
		confirm.click();
		Thread.sleep(5000);
		alert.dismiss();
		
		// Drag and Drop
		
		WebElement draggable = driver.findElement(By.id("sourceImage"));
		WebElement droppable = driver.findElement(By.id("targetDiv"));
		// action.dragAndDrop(draggable, droppable).perform();
		
		action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		Thread.sleep(6000);
		
		driver.quit();

	}

}
