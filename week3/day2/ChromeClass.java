package week3.day2;

public class ChromeClass extends Browser {
	
	public void  openIncognito() {
		System.out.println("Incognito window has opened");
	}
	public void clearCache() {
		System.out.println("cache is cleared");
	}

	public static void main(String[] args) {
		ChromeClass c=new ChromeClass();
		c.browserName="Chrome";
		System.out.println(c.browserName);
		c.openIncognito();
		c.clearCache();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
		

	}

}
