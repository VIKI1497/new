package day4;

public class UseCar {
	public static void main(String[]args) {
		Car C1=new Car();
		String[] a=args[0].split(",");
		C1.brand=a[0];
		C1.colour=a[2];
		int b=Integer.parseInt(a[1]);
		C1.price=b;
		//
		Car C2=new Car();
		String[] d=args[1].split(",");
		C2.brand=d[0];
		C2.colour=d[2];
		int e=Integer.parseInt(d[1]);
		C2.price=e;
		//
		System.out.println(C1.brand+"/"+C2.brand);
		System.out.println(C1.colour+"/"+C2.colour);
		System.out.println("Lowcost="+C2.price+" "+(C2.price<C1.price));
		
		
	}

}
class Car{
	String brand;
	String colour;
	int price;
	
}