package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
	}		
	
 public void loadUrl()
 {
	 System.out.println("Application url loaded successfully");
 }
 
	public static void main(String[] args) {
		Browser browserobj = new Browser();		
	System.out.println(browserobj.launchBrowser("Chrome"));
	browserobj.loadUrl();
	}
}