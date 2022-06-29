package collection;

public class Address {
	private int pincode;
	private String streetName;
	private String city;
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
	public int getPincode() {
		return pincode;
	}
	public void setStreetName(String streetname) {
		this.streetName=streetname;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getCity() {
		return city;
	}
	public Address(int pincode,String streetName,String city) {
		this.pincode=pincode;
		this.streetName=streetName;
		this.city=city;
	}
	public String toString() {
		return pincode+""+streetName+""+city;
	}
}
