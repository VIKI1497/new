package Oops;


public class Pen {
	private String brand;
	private int price;
	private String color;
	public Pen(String brand,int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String getcostly(Pen c) {
		if(price>c.price) {
			return brand.toUpperCase()+" is costly";
		}
		else {
			return c.brand.toUpperCase()+" is costly";
		}
	}
	public String toString() {
		return "BRAND:"+brand.toUpperCase()+" "+"PRICE:"+price+" "+"COLOR:"+color+" "+"Brand length:"+brand.length();
	}

}
