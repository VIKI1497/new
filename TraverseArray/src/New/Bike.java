package New;

public class Bike {
	private String brand;
	private int price;
	private String vehicleNumber;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public Bike(String brand,int price,String vehicleNumber) {
		this.brand=brand;
		this.price=price;
		this.vehicleNumber=vehicleNumber;
	}
	public String toString() {
		return brand+" "+price+" "+vehicleNumber;
	}

}
