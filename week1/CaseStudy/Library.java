package week1.CaseStudy;

public class Library {
	
	String addBook(String bookTitle)
	{
		System.out.println(bookTitle + ": Book added successfully");
		return(bookTitle);
	}
	public void issueBook()
	{
	System.out.println(" Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library lm=new Library();
		lm.addBook("The Hope");
		lm.issueBook();	
		
	}

}
