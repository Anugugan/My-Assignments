package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day2CheckBox {

	public static void main(String[] args) {
		//Learn to automate checkbox interactions using Selenium WebDriver and perform verifications on web elements.
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");	//enter as guest to the chrome	
       
		ChromeDriver driver=new ChromeDriver();//import chrome driver
		
		driver.get("https://leafground.com/checkbox.xhtml");//load URL	
		driver.manage().window().maximize();	//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait of 10sec
		driver.findElement(By.xpath("//span[text()='Basic']/parent::div")).click();	//- Click on the "Basic Checkbox.”

	   driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]/parent::div")).
	   click();//- Click on the "Notification Checkbox."
	   
	      // Verify that the expected message is displayed.
	  boolean displayed = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
	  System.out.println("Notification message verified:"+ displayed);
	 
       driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();//- Click on your favorite language (assuming it's related to checkboxes).
       driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();//Click on the "Tri-State Checkbox.
       //Verify which tri-state option has been chosen.
      WebElement TriStateText = driver.findElement(By.xpath("//p[text()='State = 1']"));
       System.out.println("Tri state selected is:"+ TriStateText.getText());
       
       driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
       //Verify that the expected message is displayed.
       WebElement toggleSwitch = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt100_input']"));

		if (toggleSwitch.isSelected()) {
			System.out.println("The Toggle switch is enabled");
		} else {
			System.out.println("The toggle switch is disabled");

		}
       // Verify if the Checkbox is disabled.
       boolean selected = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).isSelected();
       System.out.println("Checkbox is selected:"+ selected);
      driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();//select cities
      driver.findElement(By.xpath("//li[@data-item-value='Miami']/div")).click();//city 1
      driver.findElement(By.xpath("//li[@data-item-value='Istanbul']/div")).click();//city 2
      driver.findElement(By.xpath("//li[@data-item-value='Rome']/div")).click();//city 3
      driver.close();//close the browser window    
      
     
	}

	

}

