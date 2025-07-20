package week4.Assignments;

public class BasePage {
	public void findElement(String element) {
		System.out.println("The element to be found is: "+ element);
	}
    public void clickElement(Boolean Click) {
    	System.out.println("The element has been clicked: "+ Click);
    }
    public void enterText(String Text) {
    	System.out.println("The text to be entered is: "+ Text);
    }
    public void performCommonTasks() {
    	String a="anu";
    	String b="priya";
    	System.out.println("Common Task: "+(a+b));
    }
    public static void main(String[] args) {
		BasePage BP=new BasePage();
		BP.performCommonTasks();
	}
}
