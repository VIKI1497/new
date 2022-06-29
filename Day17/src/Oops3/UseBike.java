package Oops3;

public class UseBike {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.brand="TVS";
		bike.price=60000;
		System.out.println("Brand:"+bike.brand+", "+"Price:"+bike.price+", "+"Braking:"+bike.braking()+", "+"Horn:"+bike.toHorn()+", "+"Speed:"+bike.showSpeed(70));
	}

}

