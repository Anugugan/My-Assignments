package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;


public class CreateLead extends BaseClass{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public CreateLead clickOnLeads() {
		

	WebElement leadclk = driver.findElement(By.xpath("//a[@title='Leads']"));
	driver.executeScript("arguments[0].click();", leadclk );
		return this;
	}
	public CreateLead clickOnNew() {
		driver.findElement(By.xpath("//a[@title='New']")).click();
		return this;
		
	}
	public CreateLead enterSalutation() {
		driver.findElement(By.xpath("//span[contains(text(),'--None--')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Mrs')]")).click();
		return this;
		
	}
	public CreateLead enterFirstName() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Anupriya");	
		return this;		
		
	}
	public CreateLead enterLastName() {
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Nagaraj");
		return this;
	}
	public CreateLead enterCompanyName() {
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("Airmeet");
		return this;
	}
	public CreateLead enterLeadStatus() {
		  WebElement leadStatus = wait.until(ExpectedConditions.elementToBeClickable(
			        By.xpath("//label[text()='Lead Status']/following::div[contains(@class,'slds-combobox')]")));
			    driver.executeScript("arguments[0].click();", leadStatus);
			    
				/*
				 * wait.until(ExpectedConditions.invisibilityOfElementLocated(
				 * By.xpath("//records-modal-lwc-detail-panel-wrapper") ));
				 */

		
			    WebElement openNotContacted = wait.until(ExpectedConditions.presenceOfElementLocated(
			            By.xpath("//span[@title='Open - Not Contacted']")
			        ));

			        // Scroll to view and click via JS
			        driver.executeScript("arguments[0].scrollIntoView(true);", openNotContacted);
			        driver.executeScript("arguments[0].click();", openNotContacted);
		return this;
	}
	public ViewLead clickOnSave() {
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
		return new ViewLead();
		
		
	}

}
