package Object;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1=new Shirt();
		s1.brand="puma";
		s1.price=450;
		s1.color="black";
		//
		Shirt s2=new Shirt();
		s2.brand="adidas";
		s2.price=380;
		s2.color="grey";
		//
		Shirt s3=new Shirt();
		s3.brand="nike";
		s3.price=320;
		s3.color="white";
		//
		Shirt[] shirts={s1,s2,s3};
		int max=0;
		String a="";
		for(int i=0;i<shirts.length;i++) {
		if(shirts[i].brand.length()>max) {
			max=shirts[i].brand.length();
			a=shirts[i].brand;
			
		}
		}
		System.out.println("highest : "+max);
		System.out.println("Brand: "+a);
		
	}

}
class Shirt {
	String brand;
	int price;
	String color;
}


