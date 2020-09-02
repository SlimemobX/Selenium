package com.syntax.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.syntax.Pages.DashboardPage;
import com.syntax.Pages.LoginPageWithFindBy;
import com.syntax.Utils.BaseClass;

public class LoginTestWithFindBy {
	
	public static void main(String[] args) {
		
		BaseClass.setUp();
		LoginPageWithFindBy login = new LoginPageWithFindBy();
		DashboardPage dashboard = new DashboardPage();
		
		login.userNameTextBox.sendKeys("Admin");
		login.passwordTextBox.sendKeys("Hum@nhrm123");
		login.loginBtn.click();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("ScreenShot/HRMS/dashboard.png"));
		} catch (IOException e) {
				e.printStackTrace();
		}
		
		String adminText = dashboard.welcomeAdmin.getText();
		System.out.println(adminText);
		
		
		BaseClass.tearDown();
	}

}
