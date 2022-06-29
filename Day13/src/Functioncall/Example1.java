package Functioncall;

public class Example1 {
	public int square(int a) {
		return a*a;
	}
	public int cube(int a) {
		return a*a*a;
	}
	public static void main(String[]args) {
		Example1 e=new Example1();
		int a=2;
		System.out.println(e.square(a));
		System.out.println(e.cube(a));
	}

}
