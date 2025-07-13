package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
	//launch chrome browser	
	ChromeDriver driver=new ChromeDriver();
	
	//launch website url
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    //serach for bags for boys
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys", Keys.ENTER);
    //Print the total number of results
        WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none s-breadcrumb-header-text']"));
        System.out.println(result.getText());
    //Select the first 2 brands in the left menu
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
    // Choose New Arrivals (Sort)
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();
    //Print the first resulting bag info (name, discounted price)
        Thread.sleep(2000);
        WebElement print = driver.findElement(By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']/span)[1]"));
        System.out.println("Name of the bag:"+print.getText());
        WebElement print1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
        System.out.println("Discounted price of the bag:"+ print1.getText());
     //get the title of the page and close the browser   
     String title = driver.getTitle();
     System.out.println("title of the page:"+title);
     
     //driver.close();
	}
}
