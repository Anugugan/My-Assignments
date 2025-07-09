package week3.assignments;

public class CheckBoxButton extends Button {//day 2 assignment 1
	public void clickCheckButton() {
		System.out.println("clickcheckbutton--------->CheckBoxButton subclass");
	}
public static void main(String[] args) {
	CheckBoxButton cbb=new CheckBoxButton();
	cbb.Click();
	cbb.clickCheckButton();
	cbb.setText("Hello");
	cbb.submit();
}
}
