package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAmazon {
	public static void main(String[] args) {
		// Amazon search product and add to cart
            ChromeDriver driver=new ChromeDriver();//import chrome driver
		//launch website url
	        driver.get("https://www.amazon.in/");	
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //search for the product
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	        
	        List <WebElement> Pricedetails =driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	        System.out.println("mobile phone price list");
	        List<String> PriceList = new ArrayList<String>();
	        for (WebElement prices : Pricedetails) {
	        	String text = prices.getText();
	        	  	PriceList.add(text);}
	        System.out.println(PriceList);
	}
	        	
				
			
	        
}

