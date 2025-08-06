package pages;

import org.openqa.selenium.By;

import baseClass.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		return this;
	}
	public LoginPage enterPassWord() {
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		return this;
	}
	public HomePage clickOnLogin() {
		driver.findElement(By.id("Login")).click();
		return new HomePage();
	}
}
