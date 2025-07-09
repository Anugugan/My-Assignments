package week2.CaseStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddToCart {

	public static void main(String[] args) {
		// Amazon search product and add to cart
            ChromeDriver driver=new ChromeDriver();//import chrome driver
		//launch website url
	        driver.get("https://www.amazon.in/");	
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //search for the product
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wooden Comb");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	    //Click on a product from the result using Advanced XPath
	        driver.findElement(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']")).click();
	     //add the item to cart
	        driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
	      //Validate that the product is successfully added to the cart.
	        WebElement element = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
	       String text = element.getText();
	       System.out.println("item count in the cart:"+ text);
	       if(!text.equals(0)) {
	    	   System.out.println("The product has been added to cart");
	       }
	       else {
	    	   System.out.println("The product is not added to the cart");
	       }
	       }
	}


