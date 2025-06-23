package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int number=13;
		boolean Isprime=true;
	
		for (int i= 2; i < number; i++) {
			if(number%i==0)
			{Isprime=false;
			break;
			}
		}
			if(Isprime)
			{System.out.println(number +"is a prime number");
		}
			else {
				System.out.println(number + "is not a prime number");
			}
	}}