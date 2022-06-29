package Oops3;

public abstract class Vehicle {
	String brand;
	int price;
	public String braking() {
		return "Brake is applied vehicle stopped";
	}
	abstract public String showSpeed(int speed);
	public String toHorn() {
		return "Horning";
	}
	

}
