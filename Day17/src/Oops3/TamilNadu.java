package Oops3;

public class TamilNadu extends CentralGov {
	public String stateCode(String code) {
		return code;
	}
	public void noPlateColor(String color) {
		switch(color) {
		case "Green with White" :
			System.out.println("Electric vechile");
			break;
		case "yellow with black" :
			System.out.println("public vehicle");
			break;
		case "White with black" :
			System.out.println("private vehicle");
			break;
			default :
				System.out.println("invalid color");
				break;
		}
	}

}
