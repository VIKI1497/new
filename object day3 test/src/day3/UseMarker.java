package day3;

public class UseMarker {
	public static void main(String[]args) {
		//PRODUCT1
		Marker M1=new Marker();
		M1.price=60;
		M1.colour="RED";
		M1.weight=3.08f;
		M1.isquality=true;
		System.out.println("Price:"+M1.price);
		System.out.println("Colour:"+M1.colour);
		System.out.println("Weight:"+M1.weight);
		System.out.println("Product is Quality:"+M1.isquality);
		System.out.println();
	
	    //PRODUCT2	
		Marker M2=new Marker();
		M2.price=70;
		M2.colour="BLUE";
		M2.weight=2.08f;
		M2.isquality=true;
		System.out.println("Price:"+M2.price);
		System.out.println("Colour:"+M2.colour);
		System.out.println("Weight:"+M2.weight);
		System.out.println("Product is Quality:"+M2.isquality);
		System.out.println();
		
		//PRODUCT3
		Marker M3=new Marker();
		M3.price=80;
		M3.colour="BLACK";
		M3.weight=2.14f;
		M3.isquality=true;
		System.out.println("Price:"+M3.price);
		System.out.println("Colour:"+M3.colour);
		System.out.println("Weight:"+M3.weight);
		System.out.println("Product is Quality:"+M3.isquality);
		
	}

}
