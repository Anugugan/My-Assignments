package week4.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		//Declare an array
		int a[]= {1, 2, 3, 4, 10, 6, 8};
		//Convert to list and sort
		List <Integer> missing=new ArrayList<Integer>();
		for (Integer number : a) {
			missing.add(number);
			
		}
		Collections.sort(missing);
		//Check for missing numbers
		System.out.println("The missing Numbers are: ");
		for (int i = 0; i < missing.size()-1; i++) {
			int current=missing.get(i);
			int next= missing.get(i+1);
		//checks if there is a gap in the sequence of numbers
			if(next != current+1) {
				for (int num = current+1; num < next; num++) {
					System.out.println(num);
					
				}
			
		}
			
			
		}

	}

}
