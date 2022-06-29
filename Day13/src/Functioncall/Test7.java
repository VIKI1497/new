package Functioncall;

public class Test7 {
	public String num(int a) {
		if(a%2==0) {
			return a+" is even";
		}
		else {
			return a+" is odd";
		}
	}
	public static void main(String[]args) {
		Test7 t=new Test7();
		System.out.println(t.num(12));
	}

}
