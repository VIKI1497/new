package Functioncall;

public class Calculator {
	public void add() {
		int a=20;
		int b=40;
		System.out.println(a+b);
	}
	public void sub() {
		int a=10;
		int b=5;
		System.out.println(a-b);
		
	}
	public void mul() {
		int a=10;
		int b=12;
		System.out.println(a*b);
	}
	public static void main(String[]args) {
		Calculator c=new Calculator();
		c.add();
		c.sub();
		c.mul();
	}

}
