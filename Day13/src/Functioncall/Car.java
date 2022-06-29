package Functioncall;

public class Car {
	int price;
	String brand;
	String color;
	public String getcostly(Car c) {
		if(price>c.price) {
			return brand;
		}
		else {
			return c.brand;
		}
	}

}
