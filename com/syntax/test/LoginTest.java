package com.syntax.test;

import com.syntax.Pages.LoginPage;
import com.syntax.Utils.BaseClass;

public class LoginTest {
	
	public static void main(String[] args) {
		
		BaseClass.setUp();
		LoginPage loginPage = new LoginPage();
		
		loginPage.username.sendKeys("Admin");
		loginPage.password.sendKeys("Hum@nhrm123");
		loginPage.loginButton.click();
		
		BaseClass.tearDown();

	}

}
