package day4task;

public class UseCar {
	public static void main(String[]args) {
		//
		Car C1=new Car();
		C1.brand="Bmw";
		C1.model="XVI";
		C1.price=400000;
		C1.isPetrol=false;
		System.out.println((C1.brand).length());
		System.out.println((C1.brand).toUpperCase()+" "+C1.model+" "+C1.price+" "+C1.isPetrol);
		//
		Car C2=new Car();
		C2.brand="Tata";
		C2.model="IX";
		C2.price=300000;
		C2.isPetrol=true;
		System.out.println((C2.brand).length());
		System.out.println((C2.brand).toUpperCase()+" "+C2.model+" "+C2.price+" "+C2.isPetrol);
		//
		Car C3=new Car();
		C3.brand="Swift";
		C3.model="X2V";
		C3.price=200000;
		C3.isPetrol=true;
		System.out.println((C3.brand).length());
		System.out.println((C3.brand).toUpperCase()+" "+C3.model+" "+C3.price+" "+C3.isPetrol);
		System.out.println("total price:"+(C1.price+C2.price+C3.price));
		
		
		
	}

}
