package Condition;

public class UseBike {
	public static void main(String[]args) {
	Bike b1=new Bike();
	b1.brand="HONDA";
	b1.color="black";
	b1.price=64780;
	
	Bike b2=new Bike();
	b2.brand="TVS";
	b2.color="red";
	b2.price=89520;
	
	Bike b3=new Bike();
	b3.brand="bajaj";
	b3.color="silver";
	b3.price=98543;
	
	if (b1.price<b2.price&&b1.price<b3.price) {
		System.out.println("lowest price:"+" "+"Brand="+b1.brand+","+"color="+b1.color+","+"Price="+b1.price);
	}
	else if (b2.price<b1.price&&b2.price<b3.price) {
		System.out.println("lowest price:"+" "+"Brand="+b2.brand+","+"color="+b2.color+","+"Price="+b2.price);
		
	}
	else if (b3.price<b1.price&&b3.price<b2.price) {
		System.out.println("lowest price:"+" "+"Brand="+b3.brand+","+"color="+b3.color+","+"Price="+b3.price);
		
	}
	else {
		System.out.println("no data");
		
	}
	if (b1.brand.equals(b2.brand)) {
		System.out.println("Brands are equal");
	}
	else {
		System.out.println("Brands are not equal");
		
	}
	}

}
