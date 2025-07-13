package week3.day2;

public class Browser {
	String browserName;
	String browserVersion;
	
	public void openURL() {
		System.out.println("website is launched");
	}
public void closeBrowser() {
	System.out.println("Browser is closed");
}
public void navigateBack() {
	System.out.println("Navigated back to the website");
}
public static void main(String[] args) {
	Browser b=new Browser();
	System.out.println(b.browserName);
	b.openURL();
	b.closeBrowser();
	b.navigateBack();
}
}
