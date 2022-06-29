package Oops;
class compressor {
	private String model;
	private int capacity;
	public compressor(String model,int capacity) {
		this.model=model;
		this.capacity=capacity;
	}
	public String toString() {
		return "Compressor Model: "+model+", "+"Capacity:"+capacity;
	}
}
class Ac {
	private String brand;
	private int price;
	private String color;
	private compressor compressor;
	public Ac(String brand,int price,String color,compressor compressor) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.compressor=compressor;
	}
	public String toString() {
		return "Brand:"+brand+", "+"Price:"+price+", "+"Color:"+color+", "+compressor;
	}
}

public class UseAc {
	public static void main(String[] args) {
		compressor c=new compressor("SAMl752",2);
		Ac ac=new Ac("samsung",38000,"white",c);
		System.out.println(ac);
	}
}
