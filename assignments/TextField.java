package week3.assignments;

public class TextField extends WebElement {//day 2 assignment 1
	public void getText() {
		System.out.println("GetText---------->TextField sub class");
	}
	public static void main(String[] args) {
		TextField tf=new TextField();
		tf.Click();
		tf.getText();
		tf.setText("Hello");
	}

}
