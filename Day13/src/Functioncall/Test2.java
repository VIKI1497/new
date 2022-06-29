package Functioncall;

public class Test2 {
	public void num(int a) {
		if(a<0) {
			System.out.println(a+" is negative");
		}
		else if(a>0) {
			System.out.println(a+ "is positive");
		}
		else {
			System.out.println("Zero");
		}
	}
	public static void main(String[]args) {
		Test2 t=new Test2();
		t.num(-4);
		
	}

}
