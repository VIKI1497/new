package Functioncall;

public class Test8 {
	public void num(int a) {
		boolean b=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b=false;
			}
		}
		if(b==true) {
			System.out.println(a+" is prime");
		}
		else {
			System.out.println(a+" is not a prime");
		}
	}
	public static void main(String[]args) {
		Test8 t=new Test8();
		t.num(7);
	}

}
