package day3;

public class UseAirconditioner {
	public static void main(String[]args) {
		//PRODUCT1
		Airconditioner A1=new Airconditioner();
		A1.brand="SAMSUNG";
		A1.price=42000;
		A1.noOfWings=2;
		A1.isquality=true;
		System.out.println("BRAND:"+A1.brand);
		System.out.println("PRICE:"+A1.price);
		System.out.println("N0 0F WINGS:"+A1.noOfWings);
		System.out.println("PRODUCT IS QUALITY:"+A1.isquality);
		System.out.println();
		
		//PRODUCT2
		Airconditioner A2=new Airconditioner();
		A2.brand="VOLTAS";
		A2.price=36000;
		A2.noOfWings=2;
		A2.isquality=true;
		System.out.println("BRAND:"+A2.brand);
		System.out.println("PRICE:"+A2.price);
		System.out.println("N0 0F WINGS:"+A2.noOfWings);
		System.out.println("PRODUCT IS QUALITY:"+A2.isquality);
		
	}

}
