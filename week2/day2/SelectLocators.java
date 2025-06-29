package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectLocators {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");		
        ChromeDriver driver=new ChromeDriver(option);		
		driver.get("http://leaftaps.com/opentaps/control/main");		
		driver.manage().window().maximize();			
				
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
			    WebElement loginfield = driver.findElement(By.className("decorativeSubmit"));
			    loginfield.click();
			    driver.findElement(By.partialLinkText("CRM")).click();
			    driver.findElement(By.linkText("Leads")).click();
			    driver.findElement(By.partialLinkText("Create")).click();
			    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Airmeet");
			    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anu");
			    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gugan");
			    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
			    Select sel=new Select(source);
			    sel.selectByIndex(4);
			    WebElement element = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			    Select obj=new Select(element);
			    obj.selectByVisibleText("Automobile");
			    WebElement element1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			    Select obj1=new Select(element1);
			    obj1.selectByValue("OWN_CCORP");
			    driver.findElement(By.name("submitButton")).click();
			    String title = driver.getTitle();
				System.out.println(title);
		driver.close();


			    
			    
			    
	}

}
