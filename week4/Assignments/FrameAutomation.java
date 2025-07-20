package week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAutomation {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
		//- Load the URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//- Maximize the browser window and Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Switch to the frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Click OK
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		WebElement element = driver.findElement(By.id("demo"));
		System.out.println("text displayed after accepting the alert is " +element.getText());
		
		
        

	}

}
