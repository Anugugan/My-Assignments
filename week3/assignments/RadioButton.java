package week3.assignments;

public class RadioButton extends Button {//day 2 assignment 1
	public void selectRadioButton() {
		System.out.println("select radio button-------->radiobutton sub class");
		
	}
public static void main(String[] args) {
	RadioButton rb=new RadioButton();
	rb.Click();
	rb.selectRadioButton();
	rb.setText("Hello");
	rb.submit();
}
}
