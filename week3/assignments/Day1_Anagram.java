package week3.assignments;

import java.util.Arrays;

public class Day1_Anagram {

	public static void main(String[] args) {
		//define two strings
		String text1="stops";
		String text2="potss";
		
		//check if string length matches
		if(text1.length()!=text2.length())
		{			
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		return;
			
		}
		
		//convert string to char Array
	char[] charArray1 = text1.toCharArray();
	char[] charArray2 = text2.toCharArray();
	
	//sort the arrays
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	
	//check if both arrays are equal
	if(Arrays.equals(charArray1,charArray2)) {
		
		System.out.println("The given strings are anagram");}
	else {
		System.out.println("The given strings are not an anagram");
		
	}
	}

	}


