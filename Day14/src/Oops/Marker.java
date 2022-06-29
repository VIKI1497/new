package Oops;

public class Marker {
	String brand;
	int price;
	String color;
	public Marker(String brand,int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String toString() {
		return "BRAND:"+brand+" "+"PRICE:"+price+" "+"COLOR:"+color;
	}

}
