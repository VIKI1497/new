package Object;

public class UseBike {
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.brand="hero";
		b1.price=75000;
		b1.color="Red";
		b1.cc=100;
		
		Bike b2=new Bike();
		b2.brand="honda";
		b2.price=80000;
		b2.color="Black";
		b2.cc=150;
		
		Bike b3=new Bike();
		b3.brand="kawasaki";
		b3.price=210000;
		b3.color="Green";
		b3.cc=300;
		
		Bike[] bikes= {b1,b2,b3};
		int max=0;
		String a="";
		String b="";
		for(int i=0;i<bikes.length;i++) {
		if(bikes[i].price>max) {
			max=bikes[i].price;
			a=bikes[i].brand;
			b=bikes[i].color;
		}
			
		}
		System.out.println(max+" is highest.");
		System.out.println("Brand:"+a+" "+"color:"+b);
		
	}

}
class Bike {
	String brand;
	int price;
	String color;
	int cc;
}
