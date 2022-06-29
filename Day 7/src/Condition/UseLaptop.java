package Condition;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop l1=new Laptop();
		l1.brand="DELL";
		l1.color="black";
		l1.price=56000;
		
		Laptop l2=new Laptop();
		l2.brand="HP";
		l2.color="silver";
		l2.price=48000;
		
		if (l1.price>l2.price) {
			System.out.println("Brand="+l1.brand+","+"Color="+l1.color+","+"Price="+l1.price+","+"Net Price="+(l1.price+(l1.price*10/100)-(l1.price*18/100)));
		}
		else {
			System.out.println("Brand="+l2.brand+","+"Color="+l2.color+","+"Price="+l2.price);
			
		}
	}

}
