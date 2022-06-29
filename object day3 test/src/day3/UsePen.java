package day3;

public class UsePen {
	public static void main(String[]args) {
		
		//PRODUCT1
		Pen P1=new Pen();
		P1.name="CELLO";
		P1.price=10;
		P1.isBlueColour=true;
		P1.tipwidth=0.24f;
		
		//PRODUCT2
		Pen P2=new Pen();
		P2.name="RENOLD";
		P2.price=20;
		P2.isBlueColour=true;
		P2.tipwidth=0.5f;
		
		//PRODUCT3
		Pen P3=new Pen();
		P3.name="CASFISH";
		P3.price=5;
		P3.isBlueColour=true;
		P3.tipwidth=0.38f;
		
		System.out.println("Average:"+(P1.price+P2.price+P3.price)/3);
	}

}
