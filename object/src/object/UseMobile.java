package object;

public class UseMobile {
	public static void main(String[]args) {
		//PRODUCT 1
		Mobile M1=new Mobile();
		M1.brand="SAMSUNG";
		M1.colour="BLUE";
		M1.type="ANDROID";
		M1.price=24000;
		System.out.println("BRAND ="+M1.brand);
		System.out.println("COLOUR ="+M1.colour);
		System.out.println("TYPE ="+M1.type);
		System.out.println("PRICE ="+M1.price);
		System.out.println("");
		//PRODUCT 2
		Mobile M2=new Mobile();
		M2.brand="APPLE";
		M2.colour="GREY";
		M2.type="IOS";
		M2.price=94000;
		M2.diff=M1.price-M2.price;
		System.out.println("BRAND ="+M2.brand);
		System.out.println("COLOUR ="+M2.colour);
		System.out.println("TYPE ="+M2.type);
		System.out.println("PRICE ="+M2.price);
		System.out.println("");
		System.out.println("Difference ="+M2.diff );
		
	}

}
