package week2.Assignment;

import java.time.Duration;

//import java.time.Duration;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2FBCreateAcc {

	public static void main(String[] args) {
// Automate the Facebook registration process using Selenium WebDriver. Fill out the registration form with user information, including dropdowns and 
		ChromeDriver driver=new ChromeDriver();//import chrome driver		
		driver.get("https://en-gb.facebook.com/");//load URL	
		driver.manage().window().maximize();	//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//- Add an implicit wait to ensure the web page elements are fully loaded
        driver.findElement(By.linkText("Create new account")).click();// Click on the Create new account button.
        driver.findElement(By.name("firstname")).sendKeys("Anu");//- Enter the First name.
        driver.findElement(By.name("lastname")).sendKeys("Gugan");//- Enter the Surname.
        driver.findElement(By.name("reg_email__")).sendKeys("9876543210");//- Enter the Mobile number or email address.
        driver.findElement(By.id("password_step_input")).sendKeys("Asdert123!");//Enter new password
		
        WebElement element = driver.findElement(By.id("day"));
		Select obj=new Select(element);
		obj.selectByIndex(0);//select date of dob
		
		WebElement element2 = driver.findElement(By.id("month"));
		Select obj1=new Select(element2);
		obj1.selectByVisibleText("Oct");//select month of dob
		
		WebElement element3 = driver.findElement(By.id("year"));
		Select obj3=new Select(element3);
		obj3.selectByValue("1996");//select year of dob
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
      
		
		
		

	}

	
}
	

