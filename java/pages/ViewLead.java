package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class ViewLead extends BaseClass{
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
public ViewLead verifyLeadName() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement leadNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.xpath("//div[@class='slds-media__body']/h1/slot/lightning-formatted-name"))
    );

    String leadName = leadNameElement.getText();
    System.out.println("Lead Name Displayed: " + leadName);

    if (leadName.contains("Anupriya")) {
        System.out.println("Lead is created");
    } else {
        System.out.println("Lead is not created");
    }

    return this;
}
	

}
