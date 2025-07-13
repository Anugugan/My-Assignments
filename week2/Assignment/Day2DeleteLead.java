package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day2DeleteLead {

	public static void main(String[] args) {
		// delete lead
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
	    driver.findElement(By.partialLinkText("Find")).click();//click on find leads
	    driver.findElement(By.linkText("Phone")).click();//click on phone tab
	    driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
	    driver.findElement(By.partialLinkText("Find")).click();
	    WebElement element = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));//find the lead ID in teh result
	    String  Id = element.getText();//Capture the lead ID text
	    System.out.println("captured lead ID : " + Id);//print the ID
	    element.click();//click the captured id
	    driver.findElement(By.linkText("Delete")).click();//delete the lead
	    driver.findElement(By.partialLinkText("Find")).click();//click on find leads again
	    driver.findElement(By.name("id")).sendKeys(Id);//enter the captured ID
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        // Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
	   WebElement element2 = driver.findElement(By.xpath("//div[text()='No records to display']"));
        if(element2.isDisplayed()) {
        	System.out.println(Id + ":The lead has been deleted and no records to display");
        }
        else {
        	System.out.println("The lead is not deleted");
        }
        driver.close();
	    
	    

	}

}
