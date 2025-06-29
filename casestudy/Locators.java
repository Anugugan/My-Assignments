package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();	
		
				
							driver.findElement(By.name("email")).sendKeys("testleaf.2023@gmail.com");
				WebElement pwd = driver.findElement(By.name("pass"));
				pwd.sendKeys("Tune321");
			    WebElement loginfield = driver.findElement(By.name("login"));
			    loginfield.click();
			    driver.findElement(By.linkText("Forgotten password?")).click();
			    		String title = driver.getTitle();
			    		System.out.println(title);
			   

}}
