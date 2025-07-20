package week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAutomating {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
		//- Load the URL
		driver.get("https://www.leafground.com/alert.xhtml");
		//- Maximize the browser window and Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//- Click on the "Prompt Box" button to trigger the alert
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt104']")).click();
		//Switch to the alert and type a message in the alert box.
		String Name="Anupriya";
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(Name);
		//Dismiss the alert
		alert.dismiss();
		//Retrieve the typed text from the alert and verify it
		WebElement element = driver.findElement(By.xpath("//span[@id='confirm_result']"));
		String text = element.getText();
		//- Use conditional statements to verify the text entered in the alert
		if(text.contains(Name)) {
			System.out.println("The input is verified");
		}
		else {
			System.out.println("The input is not verified");
		}
	}

}
