package Oops;

public class UseCar {
	public static void main(String[]args) {
		Engine e=new Engine();
		e.brand="motogp";
		e.model="mt002";
		e.type="bs6";
		//
		Engine e1=new Engine();
		e1.brand="japan";
		e1.model="yto986";
		e1.type="bs6";
		
		Car c1=new Car();
		c1.brand="tata";
		c1.price=500000;
		c1.color="red";
		c1.engine=e;
		//
		Car c2=new Car();
		c2.brand="hyndai";
		c2.price=600000;
		c2.color="grey";
		c2.engine=e1;
		System.out.println("Brand: "+c1.brand+", "+"Price: "+c1.price+", "+"Color :"+c1.color+", "+"Engine Brand: "+c1.engine.brand+", "+"Engine Model :"+c1.engine.model+", "+"Engine Type: "+c1.engine.type);
		System.out.println("Brand: "+c2.brand+", "+"Price: "+c2.price+", "+"Color :"+c2.color+", "+"Engine Brand: "+c2.engine.brand+", "+"Engine Model :"+c2.engine.model+", "+"Engine Type: "+c2.engine.type);
	}

}
