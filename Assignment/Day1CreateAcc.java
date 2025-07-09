package week2.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day1CreateAcc {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");	//enter as guest to the chrome	
       
		ChromeDriver driver=new ChromeDriver();//import chrome driver
		
		driver.get("http://leaftaps.com/opentaps/control/main");//load URL	
		driver.manage().window().maximize();	//maximize window
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enter password
	    driver.findElement(By.className("decorativeSubmit")).click();//click login button
	    driver.findElement(By.partialLinkText("CRM")).click();//click on image link
	    driver.findElement(By.linkText("Accounts")).click();//click on create account
	    driver.findElement(By.partialLinkText("Create")).click();//click on create account
	    driver.findElement(By.id("accountName")).sendKeys("Airmeer Acc");//to enter acc name
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");//enter description
	    driver.findElement(By.name("numberEmployees")).sendKeys("50");//enter no of employees
	    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");//enter sitename
	    driver.findElement(By.className("smallSubmit")).click();//click submit
	    String title = driver.getTitle();
	    System.out.println(title);//show title in eclipse console
	    driver.close();//close the browser window  
	   
	}


}
