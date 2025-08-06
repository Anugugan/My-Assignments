package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class HomePage extends BaseClass {
	public HomePage clickOnAppLauncher() {
	driver.findElement(By.xpath("//button[@title='App Launcher']/div")).click();
	return this;
	}
    public HomePage clickOnViewAll() {
    driver.findElement(By.xpath("//button[text()='View All']")).click();
    return this;
    }
    
    public CreateLead clickOnSales() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement SalesLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Sales']/ancestor::a")));
    SalesLink.click();
    return new CreateLead();
    }
}
