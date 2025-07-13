package week3.assignments;


import java.util.Arrays;

public class Day1_MissingElement {

	public static void main(String[] args) {
		int a[]= {1, 4,3,2,8, 6, 7};
 System.out.println("missing element:");
 Arrays.sort(a);
 for (int i = 0; i < a.length-1; i++) {
	 if(a[i+1]!=a[i]+1) {
		 System.out.println(a[i]+1);
		 break;
	 }
	
}
	}

}
