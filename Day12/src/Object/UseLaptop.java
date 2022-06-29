package Object;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="dell";
		l1.price=45000;
		l1.color="black";
		//
		Laptop l2=new Laptop();
		l2.brand="hp";
		l2.price=38000;
		l2.color="silver";
		//
		Laptop l3=new Laptop();
		l3.brand="lenovo";
		l3.price=32000;
		l3.color="black";
		//
		Laptop[] laptops={l1,l2,l3};
		int min=laptops[1].price;
		String a="";
		String b="";
		for(int i=0;i<laptops.length;i++) {
		if(laptops[i].price<min) {
			min=laptops[i].price;
			a=laptops[i].brand;
			b=laptops[i].color;
		}
		}
		System.out.println("lowest price: "+min);
		System.out.println("Brand: "+a+", "+"color: "+b);
		
	}

}
class Laptop {
	String brand;
	int price;
	String color;
}
