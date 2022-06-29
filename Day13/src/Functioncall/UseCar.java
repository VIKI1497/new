package Functioncall;

public class UseCar {
	public static void main(String[]args) {
		Car c1=new Car();
		c1.brand="tata";
		c1.price=542000;
		c1.color="red";
		
		Car c2=new Car();
		c2.brand="bmw";
		c2.price=848000;
		c2.color="White";
		
		System.out.println(c2.getcostly(c1));
	}

}
