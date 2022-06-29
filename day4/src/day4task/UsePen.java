package day4task;

public class UsePen {
	public static void main (String[]args) {
		//
		Pen P1=new Pen();
		P1.brand="reynolds";
		P1.price=5;
		P1.colour="blue";
		System.out.println((P1.brand).toUpperCase());
		System.out.println((P1.brand).contains("r"));
		System.out.println((P1.colour).equals("BLUE"));
		System.out.println((P1.colour).charAt(2));
		System.out.println((P1.brand).split("")[0]);
		System.out.println((P1.colour).length());
		//
		Pen P2=new Pen();
		P2.brand="parker";
		P2.price=25;
		P2.colour="black";
		System.out.println((P2.brand).toUpperCase());
		System.out.println((P2.brand).contains("r"));
		System.out.println((P2.colour).equals("black"));
		System.out.println((P2.colour).charAt(4));
		System.out.println((P2.colour).length());
		
		

		}

}
