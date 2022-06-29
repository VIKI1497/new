package Oops3;

public class Bike extends Vehicle {
	public String showSpeed(int speed) {
		if(speed>=10&&speed<=20) {
			return " slow speed ";
		}
		else if(speed>20&&speed<=60) {
			return " normal speed ";
		}
		else if(speed>60&&speed<=120) {
			return " high speed ";
		}
		else {
			return "invalid speed";
		}
	}
	

}
