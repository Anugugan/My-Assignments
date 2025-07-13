package week3.day1;

public class StringReverse {

	public static void main(String[] args) {
		 String companyName="TestLeaf";
		 char[] input = companyName.toCharArray();
		 System.out.println("The reversed string is:");
		 for (int i = input.length -1; i >=0; i--) {
	            System.out.print(input[i]);			
		}

	}

}
