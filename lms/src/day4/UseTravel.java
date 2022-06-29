package day4;

public class UseTravel{
	public static void main(String[]args) {
		//
		Travel T1=new Travel();
		String[] x=args[0].split(",");
		T1.brand =x[0];
		int a=Integer.parseInt(x[1]);
		T1.price=a;
		//
		Travel T2=new Travel();
		String[] y=args[1].split(",");
		T2.brand=y[0];
		int b=Integer.parseInt(y[1]);
		T2.price=b;
		System.out.println((T1.brand).toUpperCase()+(T2.brand).toUpperCase());
		System.out.println((T1.price+T2.price));
		System.out.println(T1.price<T2.price);
		System.out.println(T1.price>T2.price);
		
		
	}
}

 class Travel {
	 String brand;
	 int price;

}

