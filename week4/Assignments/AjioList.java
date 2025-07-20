package week4.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {
	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser
        ChromeDriver driver=new ChromeDriver();
		//Load the Url
		driver.get("https://www.myntra.com/");
		//maximize window
		driver.manage().window().maximize();	
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//In the search box, type as "bags" and press enter
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Bags",Keys.ENTER);
		//To the left of the screen under "Gender" click on "Men"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		//- Under "Category" click "Hand Bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Handbags']")).click();
	    //- Print the count of the items found. 
		Thread.sleep(2000);
	   WebElement element = driver.findElement(By.xpath("//span[@class='title-count']"));
	   System.out.println("No.of.Items found:"+element.getText());
	    //Get the list of brand of the products displayed in the page and print the list
	    List<WebElement> Brands = driver.findElements(By.xpath("//ul[@class='brand-list']/li/label"));
	    List<String> BrandList = new ArrayList<>();
	    for (WebElement BrandElement : Brands) {
	    	String BrandName = BrandElement.getText();
	    	String BNameAlone = BrandName.split("\\(")[0].trim();
	    	BrandList.add(BNameAlone); 	
			}
	    System.out.println("List of the Brands"+ BrandList);
	    //Get the list of names of the bags and print it
	    List<WebElement> Products = driver.findElements(By.xpath("//h4[@class='product-product']"));
	    List<String> ProductList=new ArrayList<>();
	    for (WebElement BagName : Products) {
	    	String BagNames = BagName.getText();
	    	ProductList.add(BagNames);    	
			}
	System.out.println("List of the bag names:"+ ProductList);
	
	}

}
