package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static ChromeDriver driver;
	public static ChromeOptions Options;
	public static WebDriver wait;
	
	@BeforeMethod
	public void preCondn() {
		Options= new ChromeOptions();
		Options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(Options);		 
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	/*
	 * @AfterMethod public void postCondn() { driver.close(); }
	 */

}
