package week3.assignments;

public class WebElement {//day 2 assignment 1
	public void Click() {
	System.out.println("Click--------->webelement super class");
	}
public void setText(String text) {
	System.out.println(text+" "+"settext------>webelement super class");
}
public static void main(String[] args) {
	WebElement we=new WebElement();
	we.Click();
	we.setText("Text entered is:Hello");
}
}
