package Functioncall;

public class Calculator1 {
	public int add() {
		int a=20;
		int b=40;
		return (a+b);
	}
	public int sub() {
		int a=10;
		int b=5;
		return (a-b);
	}
	public int mul() {
		int a=10;
		int b=12;
		return (a*b);
	}
	public static void main(String[]args) {
		Calculator1 c=new Calculator1();
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		
	}

}
