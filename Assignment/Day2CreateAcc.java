package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Day2CreateAcc {

			public static void main(String[] args) {
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("guest");	//enter as guest to the chrome	
	       
			ChromeDriver driver=new ChromeDriver();//import chrome driver
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("http://leaftaps.com/opentaps/control/main");//load URL	
			driver.manage().window().maximize();	//maximize window
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");//enter username
			driver.findElement(By.id("password")).sendKeys("crmsfa");//enter password
		    driver.findElement(By.className("decorativeSubmit")).click();//click login button
		    driver.findElement(By.partialLinkText("CRM")).click();//click on image link
		    driver.findElement(By.linkText("Accounts")).click();//click on create account
		    driver.findElement(By.partialLinkText("Create")).click();//click on create account
		    String name="AnupriyaAccount";
		    driver.findElement(By.id("accountName")).sendKeys(name);//to enter acc name
		    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");//enter description
		    WebElement element = driver.findElement(By.name("industryEnumId"));
		    Select obj=new Select(element);
		    obj.selectByValue("IND_SOFTWARE");//select industry name from DD
		    WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		    Select obj1=new Select(element2);
		    obj1.selectByVisibleText("S-Corporation");//select ownership from DD SelectByVisibleText.
		    WebElement element3 = driver.findElement(By.id("dataSourceId"));
		    Select obj3=new Select(element3);
		    obj3.selectByValue("LEAD_EMPLOYEE");//select source from DD SelectByValue
		    WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		    Select obj4=new Select(element4);
		    obj4.selectByIndex(6);//select campaign from DD SelectByIndex.
		    WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));		    
		    Select obj5=new Select(element5);
		    obj5.selectByValue("TX");//select state from DD using value  
		    driver.findElement(By.className("smallSubmit")).click();//create acc
		  //print the title
		    String title = driver.getTitle();
		    System.out.println(title);
		    
		//verify the acc name is correct

		    String element6 = driver.findElement(By.xpath("//span[contains(text(),'"+name+"')]")).getText();//Locating the displayed account name element
		    if(element6.contains(name)) {
		    	System.out.println("The account name is verified:"+ name);
		    	
		    		    	
		    }
		    driver.close();			
		    	    
			}}
		   
		     //close the browser window

	


