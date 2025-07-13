package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browse
         ChromeDriver driver=new ChromeDriver();
		//Load the Url
		driver.get("https://www.pvrcinemas.com/");
		//maximize window
		driver.manage().window().maximize();	
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Choose location as "Chennai"
		driver.findElement(By.xpath("//span[@class='cities-placed']/parent::span")).click();
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		// Click on Cinema under Quick Book
        driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		//Select Your Cinema
        driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[2]")).click();
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
        //Select  Date as Tomorrow
        driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
        //Select Your Movie
        Thread.sleep(2000);
       driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]/span")).click();
        //Select Your Show Time
       Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='p-dropdown-item']")).click();
        //Click on Book Button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Click Accept on Term and Condition
        driver.findElement(By.xpath("//button[text()='Accept']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//button[text()='Accept']")).click();
        //Click any one available seat
       driver.findElement(By.xpath("//span[@id='CL.CLUB|H:9']")).click();
       //Click Proceed Button
       driver.findElement(By.xpath("//button[text()='Proceed']")).click();
       //Print the Seat info under book summary
       WebElement element = driver.findElement(By.className("seat-info"));
       System.out.println( element.getText());
       //Print the grand total under book summary
       WebElement element2 = driver.findElement(By.className("all-grand"));
       System.out.println(element2.getText());
       //Click Proceed Button
       driver.findElement(By.className("fb-added-btndesk")).click();
       Thread.sleep(2000);    
       //Close the popup
       driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
       
       //Print Your Current Page title
       String title = driver.getTitle();
       System.out.println(title);
       
       //Close Browser
       driver.close();

	}

}
