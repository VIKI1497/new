package Condition;

public class UseMarker {
	public static void main(String[]args) {
		Marker m1=new Marker();
		m1.price=15;
		m1.brand="Camlin";
		m1.color="red";
		
		Marker m2=new Marker();
		m2.price=20;
		m2.brand="reynold";
		m2.color="black";
		
		if (m1.price%2==0) {
			System.out.println("even");
			
		}
		else {
			System.out.println("odd");
		}
	}

}
