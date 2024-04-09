/* Declare a class called book having author_name as private data 
member. Extend book class to have two sub classes called 
book_publication & paper_publication. Each of these classes have 
private member called title. Write a complete program to show 
usage of dynamic method dispatch (dynamic polymorphism) to display 
book or paper publications of given author.Use command line 
arguments for inputting data.  */
class Book{
	private String author_name;
	public Book(String author_name){
		this.author_name = author_name;
	} 
	public void print(){
		System.out.println("Name of Author = "+author_name);
	}
}
class Book_publication extends Book{
	private String title;
	public Book_publication(String title, String author_name){
		super(author_name);
		this.title = title;
	}
	public void print(){
		super.print();
		System.out.println("Title of Book_publication = "+title);
	}
}
class Paper_publication extends Book{
	private String title;
	public Paper_publication(String title , String author_name){
		super(author_name);
		this.title = title;
	}
	public void print(){
		super.print();
		System.out.println("Title of Paper_publication = "+title);
	}
}
public class Lab_6_2{
	public static void main(String[] args) {
		Book book = new Book(args[0]);
		if(args[2].equalsIgnoreCase("book")){
		    Book book_publication = new Book_publication(args[1],args[0]);
			// book.print();
			book_publication.print();
		} else if(args[2].equalsIgnoreCase("paper")){
			Book paper_publication = new Paper_publication(args[1],args[0]);
			// book.print();
			paper_publication.print();
		}
	}
}
