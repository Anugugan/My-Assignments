package week4.day1;

public class Overloading {
	public void reportStep(String msg, String status) {
		System.out.println("Message:"+msg+" "+"Status:"+status);
		
		
	}
	public void reportStep(String msg, String status,Boolean snap) {
		System.out.println("Message:"+msg+" "+"Status:"+status+" "+"snapshot:"+snap);
		
	}
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.reportStep("Hello", "delivered");
		obj.reportStep("Hi", "sent", true);
	}
}
