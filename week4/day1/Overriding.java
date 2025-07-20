package week4.day1;

public class Overriding extends Overloading {
	
	public void reportStep(String msg, String status) {
		System.out.println("overriding output\n"+"Message:"+msg+" "+"Status:"+status);
		
		
	}
	
	public static void main(String[] args) {
		Overriding obj=new Overriding();
		obj.reportStep("Hello from overriding", "delivered");
		
	}

}
