class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
}
class Ebook extends Book{
	double filesizeMB;
	Ebook(String title, String author, double price,double filesizeMB) {
		super(title, author, price);
		this.filesizeMB=filesizeMB;		
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("File Size Info: "+filesizeMB);
	}
}
class PrintedBook extends Book{
	int numberOfPages;
	PrintedBook(String title, String author, double price,int numberOfPages){
		super(title, author,price);
		this.numberOfPages=numberOfPages;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number Of Pages: "+numberOfPages);
	}
}

public class Demo {
	public static void main(String[] args) {
		Ebook Eb1 = new Ebook("ABC","Adi",100.00,69.69);
		Eb1.displayDetails();
		PrintedBook Pb1 = new PrintedBook("XYZ","ABC",69.42,420);
		Pb1.displayDetails();
	}
}
