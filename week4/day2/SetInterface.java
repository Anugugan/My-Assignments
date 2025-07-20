package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
	public static void main(String[] args) {
		String CompanyName= "google";
		char[] charArray = CompanyName.toCharArray();
		Set <Character> unique=new LinkedHashSet<Character>();
		Set <Character> Duplicate=new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			boolean b = unique.add(charArray[i]);
			if(!b)
			{Duplicate.add(charArray[i]);
			}
			}
			
		
		System.out.println("unique values are:"+unique);
		System.out.println("Duplicate Value is:"+ Duplicate);
	}

}
