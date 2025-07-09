package week3.assignments;

public class Day1_ReverseOddWords {

	public static void main(String[] args) 
	{String test = "I am a software tester";

    // Split the string into words
    String[] words = test.split(" ");

    //  Traverse through each word using a loop
    for (int i = 0; i < words.length; i++) {

        // : Check if index is odd
        if (i % 2 != 0) {
            //  Convert the word to a character array and reverse it
            char[] chars = words[i].toCharArray();
            for (int j = chars.length - 1; j >= 0; j--) {
                System.out.print(chars[j]);
            }
        } else {
            // Print the word as-is for even indices
            System.out.print(words[i]);
        }

        // Add space between words
        System.out.print(" ");
    }
}
}