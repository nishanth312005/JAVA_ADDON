package Java_day3;
import java.util.*;

class Book{
	int bookid;
	String title,author;
	double price;
	
	//'this' is a reference variable that refers to current object
	
	Book(int bookid, String title, String author,double price){
		this.bookid=bookid;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void display() {
		System.out.println("BOOK ID:"+bookid);
		System.out.println("BOOK TITLE:"+title);
		System.out.println("BOOK AUTHOR:"+author);
		System.out.println("BOOK PRICE:"+price+"\n");		
	}
}
public class Library_Management {
	public static void main(String[] args) {
		Book b = new Book(01,"Java","Gossling",100);
		Book b1 = new Book(02,"Python","Guido",200);
		Book b2 = new Book(0,null,null,0);
		b2.author="bala";
		b2.price=300;
		b2.bookid=130;
		b2.title="C++";
		
		b.display();
		b1.display();
		b2.display();		
	}
}
