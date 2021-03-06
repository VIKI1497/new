package New;

import java.util.ArrayList;
import java.util.HashMap;

public class UseBike {
	public static void main(String[] args) {
		Bike b1=new Bike("Honda",68000,"TN07B4210");
		Bike b2=new Bike("Hero",55000,"TN10H7016");
		Bike b3=new Bike("Yamaha",94000,"TN14U8025");
		ArrayList<Bike> bikes=new ArrayList<>();
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		HashMap<String,Bike> bikeDetails=new HashMap<>();
		for(Bike x:bikes) {
			bikeDetails.put(x.getVehicleNumber(),x);
		}
		System.out.println("--output of HashMap--");
		System.out.println(bikeDetails);
		System.out.println("--output of list--");
		System.out.println(bikes);
		bikeDetails.forEach((vehicle,brand)->System.out.println("Key="+vehicle+"  "+"Values="+brand));
		for(String y:bikeDetails.keySet()) {
			System.out.println(y);
		}
	}
}
