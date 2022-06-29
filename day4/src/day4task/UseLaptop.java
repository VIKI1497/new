package day4task;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop L1=new Laptop();
		L1.brand="Dell";
		L1.price=50000;
		L1.colour="Silver";
		L1.isWarrenty=true;
		System.out.println((L1.brand).toUpperCase());
		System.out.println((L1.brand).length());
		System.out.println((L1.brand).startsWith("D"));
		System.out.println((L1.brand).charAt(3));
		System.out.println((L1.colour).toLowerCase());
		
	}

}
