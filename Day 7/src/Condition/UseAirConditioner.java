package Condition;

public class UseAirConditioner {
	public static void main(String[]args) {
		AirConditioner ac1=new AirConditioner();
		ac1.brand="LG";
		ac1.price=34000;
		ac1.capacity="1-ton";
		ac1.length=ac1.brand.length();
		
		AirConditioner ac2=new AirConditioner();
		ac2.brand="SAMSUNG";
		ac2.price=47000;
		ac2.capacity="3-ton";
		ac2.length=ac2.brand.length();
		
		AirConditioner ac3=new AirConditioner();
		ac3.brand="VOLTAS";
		ac3.price=38000;
		ac3.capacity="2-ton";
		ac3.length=ac3.brand.length();
		
		if (ac1.length>ac2.length&&ac1.length>ac3.length) {
			System.out.print("Brand="+ac1.brand+","+"Price="+ac1.price+","+"Capacity="+ac1.capacity);
		}
		else if (ac2.length>ac1.length&&ac2.length>ac3.length) {
			System.out.println("Brand="+ac2.brand+","+"Price="+ac2.price+","+"Capacity="+ac2.capacity);
		}
		else if (ac3.length>ac1.length&&ac3.length>ac2.length) {
			System.out.println("Brand="+ac3.brand+","+"Price="+ac3.price+","+"Capacity="+ac3.capacity);
		}
		else {
			System.out.println("not available");
		}

	}

}
