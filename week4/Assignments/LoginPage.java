package week4.Assignments;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		int a=1;
		int b=2;
		System.out.println((a+b));
	}
	public static void main(String[] args) {
		LoginPage LP=new LoginPage();
		LP.findElement("Anupriya");
		LP.clickElement(true);
		LP.enterText("Text is entered");
		LP.performCommonTasks();
	}

}
