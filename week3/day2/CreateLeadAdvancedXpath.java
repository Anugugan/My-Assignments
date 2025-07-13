package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLeadAdvancedXpath {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");	//enter as guest to the chrome	
       
		ChromeDriver driver=new ChromeDriver();//import chrome driver
		
		
		driver.get("http://leaftaps.com/opentaps/");//load URL	
		driver.manage().window().maximize();	//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enter password
	    WebElement loginfield = driver.findElement(By.className("decorativeSubmit"));
	    loginfield.click();//click on login
	    driver.findElement(By.partialLinkText("CRM")).click();//click on image
	    driver.findElement(By.linkText("Leads")).click();//click on leads
	    driver.findElement(By.partialLinkText("Create")).click();//create lead
	    
	}

}
