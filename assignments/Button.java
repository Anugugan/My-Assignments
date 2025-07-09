package week3.assignments;

public class Button extends WebElement {//day 2 assignment 1
	
	public void submit() {
		System.out.println("Submit--->Button sub class");
	}
	public static void main(String[] args) {
		Button b=new Button();
		b.Click();
		b.setText("hello");
		b.submit();
	}

}
