package Oops;

public class Phone {
	private String brand;
	private int price;
	private String model;
	private Ram ram;
	public Phone(String brand,int price,String model,Ram ram) {
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.ram=ram;
	}
	public String toString() {
		return "BRAND="+brand.toUpperCase()+", "+"PRICE="+price+", "+"MODEL="+model+", "+ram;
	}

}
