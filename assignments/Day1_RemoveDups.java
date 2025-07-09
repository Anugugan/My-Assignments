package week3.assignments;

public class Day1_RemoveDups {

	public static void main(String[] args) {
		//define string
		String text = "We learn Java basics as part of java sessions in java week1";
		
		
		//split sentence using space
		String[] words = text.split(" ");
		int count=0;
		//compare each words using nested for loops
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					words[j]="";
					count=count++;
				}
			}
		}
		 {
			 //if (count > 1) {
		 
		System.out.println("Text after removing duplicate words:");
					
				for (String word:words) {
					if(!word.equals("")) {
						System.out.print(word + " ");
						}
				
		
				}
			 }	}}
				
				
			
				
				
			
		 
	

	

	
			
		

	


