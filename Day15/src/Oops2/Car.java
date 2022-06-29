package Oops2;

public class Car extends FourWheeler {
	private int noOfSeats;
	private String color;
	private int price;
	public void setnoOfSeats(int noOfSeats) {
		this.noOfSeats=noOfSeats;
	}
	public int getnoOfSeats() {
		return noOfSeats;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public String getcolor() {
		return color;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public Car(String brand,String model,int noOfSeats,String color,int price) {
		super(brand,model);
          this.noOfSeats=noOfSeats;
          this.color=color;
          this.price=price;
          
	}
	public String toString() {
		return super.toString()+" "+noOfSeats+" "+color+" "+price;
	}

}
