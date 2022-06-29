package Functioncall;

public class UseBike {
		
public static void main(String[]args) {

			Bike b1=new Bike();
			Bike b2=new Bike();
			b1.price=56000;
			b1.cc=150;
			b2.price=62000;
			b2.cc=180;
			System.out.println(b1.high(b1.price, b2.price));
			
			}
	}


