package week2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Day2EditLead {

	public static void main(String[] args) {
		// Edit Lead
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");	//enter as guest to the chrome	
       
		ChromeDriver driver=new ChromeDriver();//import chrome driver
		
		driver.get("http://leaftaps.com/opentaps/");//load URL	
		driver.manage().window().maximize();	//maximize window
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enter password
	    WebElement loginfield = driver.findElement(By.className("decorativeSubmit"));
	    loginfield.click();//click on login
	    driver.findElement(By.partialLinkText("CRM")).click();//click on image
	    driver.findElement(By.linkText("Leads")).click();//click on leads
	    driver.findElement(By.partialLinkText("Create")).click();//create lead
	    driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("ABB");//enter company name
	    driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Isha");//enter first name
	    driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("Kumar");//enter last name
	    driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("Ish");//enter first name local
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Engineering");//enter dept
        driver.findElement(By.id("createLeadForm_description")).sendKeys("ECE engineering");//enter description
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anurohi2013@gmail.com");//enter email
        
        WebElement element = driver.findElement(By.name("generalStateProvinceGeoId"));
	    Select obj=new Select(element);
	    obj.selectByVisibleText("New York");//enter state
	    
	    driver.findElement(By.name("submitButton")).click();//create lead button
	    driver.findElement(By.linkText("Edit")).click();//edit the lead
	    driver.findElement(By.id("updateLeadForm_description")).clear();//clear the description box
	    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("importance of ece will be seen");//add important note
	    driver.findElement(By.className("smallSubmit")).click();//update the edits
	    String title = driver.getTitle();
	    System.out.println(title);//- Get the Title of the Resulting Page.
        driver.close();//close the browser
	    
	    
	    
		
		
		
		

	}

}
