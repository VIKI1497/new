package Oops2;

public class LuxuaryCar extends Car {
	private boolean isAutomatic;
	public void setisAutomatic(boolean isAutomatic) {
		this.isAutomatic=isAutomatic;
	}
	public boolean getisAutomatic() {
		return isAutomatic;
	}
	public LuxuaryCar(String brand,String model,int noOfSeats,String color,int price,boolean isAutomatic) {
		super(brand,model,noOfSeats,color,price);
		this.isAutomatic=isAutomatic;
		}
		public String toString() {
			return super.toString()+" "+isAutomatic;
		}
		
		
	}


