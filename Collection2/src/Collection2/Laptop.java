
package Collection2;

public class Laptop {
	private String brand;
	private String proccessor;
	private int price;
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setProccessor(String proccessor) {
		this.proccessor=proccessor;
	}
	public String getProccessor() {
		return proccessor;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public Laptop(String brand,String proccessor,int price) {
		this.brand=brand;
		this.proccessor=proccessor;
		this.price=price;
	}
	public String toString() {
		return brand+""+proccessor+""+price;
	}

}
