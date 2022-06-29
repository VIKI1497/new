package object;

public class UseBike {
	public static void main(String[]args) {
		Bike B1=new Bike();
		B1.brand="YAMAHA";
		B1.model="R15";
		B1.colour="RED";
		B1.price=152574;
		B1.topSpeed=120;
		B1.milage=45.7f;
		B1.weight=148.54f;
		B1.height=5.8f;
		B1.tax=5123;
		B1.discount=1200;
		B1.netPrice=B1.price+B1.tax-B1.discount;
		System.out.println("BRAND ="+B1.brand);
		System.out.println("MODEL ="+B1.model);
		System.out.println("COLOUR ="+B1.colour);
		System.out.println("PRICE ="+B1.price);
		System.out.println("TOP SPEED ="+B1.topSpeed);
		System.out.println("MILAGE ="+B1.milage);
		System.out.println("WEIGHT ="+B1.weight);
		System.out.println("HEIGHT ="+B1.height);
		System.out.println("TAX ="+B1.tax);
		System.out.println("DISCOUNT ="+B1.discount);
		System.out.println("NET PRICE ="+B1.netPrice);
		System.out.println();
		
		Bike B2=new Bike();
		B2.brand="HONDA";
		B2.model="SPLENDER";
		B2.colour="RED";
		B2.price=75574;
		B2.topSpeed=60;
		B2.milage=65.7f;
		B2.weight=108.54f;
		B2.height=5.4f;
		B2.tax=2223;
		B2.discount=1400;
		B2.netPrice=B2.price+B2.tax-B2.discount;
		System.out.println("BRAND ="+B2.brand);
		System.out.println("MODEL ="+B2.model);
		System.out.println("COLOUR ="+B2.colour);
		System.out.println("PRICE ="+B2.price);
		System.out.println("TOP SPEED ="+B2.topSpeed);
		System.out.println("MILAGE ="+B2.milage);
		System.out.println("WEIGHT ="+B2.weight);
		System.out.println("HEIGHT ="+B2.height);
		System.out.println("TAX ="+B2.tax);
		System.out.println("DISCOUNT ="+B2.discount);
		System.out.println("NET PRICE ="+B2.netPrice);
		System.out.println();
		
	}
}
