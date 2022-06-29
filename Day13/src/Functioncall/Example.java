package Functioncall;

public class Example {
	public int add(int a,int b) {
		return a+b;
	}
	public void show(String a) {
		System.out.println(a);
	}
	public String getName() {
		return "OneSoft";
	}
	public float mul(int a,int b) {
		return a*b;
	}
	public static void main(String[]args) {
		Example e=new Example();
		System.out.println(e.add(10, 20));
		e.show("Hello");
		System.out.println(e.getName());
		System.out.println(e.mul(20, 30));
	}

}
