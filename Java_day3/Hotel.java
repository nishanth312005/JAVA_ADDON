package Java_day3;

import java.util.*;

class Order{
	String Recipe;
	int orderid,quantity;
	int price=100;
	
	void get() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter order id:");
		orderid=s.nextInt();
		System.out.println("Enter Recipe:");
		Recipe=s.next();
		System.out.println("Enter Quantity:");
		quantity=s.nextInt();
		System.out.println();			
	}
	
	void display() {
		System.out.println("Take your order:");
		System.out.println("****************");
		System.out.println("Your order ID:"+orderid);
		System.out.println("Your Recipe :"+Recipe);
		System.out.println("Quantity:"+quantity);
		System.out.println("Total price:"+price);
		System.out.println("Thankyou for visiting our hotel !!!");
	}	
}
public class Hotel {
	public static void main(String[] args) {
		Order o=new Order();
		o.get();
		o.display();		
	}
}
