package week4.Assignments;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class FindSecondLarge {

	public static void main(String[] args) {
		//array has been declared
		int array[]= {3, 2, 11, 4, 6, 7};
		//int array has been assigned to the list
		List<Integer> list=new ArrayList<Integer>();
		//iterate the values and add to the list
		for (Integer numbr : array) {
			list.add(numbr);
			
		}
		//sorting the numbers
		Collections.sort(list);
		//print the second largest element in the list
		System.out.println("thesecond largets number is"+ list.get(list.size()-2));


	}

}
