package week1.casestudy;

public class IsPalindrome {

	public static void main(String[] args) {
		int input = 121; 
        int output = 0; 
        int original = input;

        for (int i = input; i > 0; i = i / 10) {
            int j = i % 10;             
            output = (output * 10) + j; 
        }

        if (original == output) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}


