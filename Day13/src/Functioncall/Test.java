package Functioncall;

public class Test {
	public void vote(int a) {
		if(a>=18) {
			System.out.println(a+" is eligible for vote");
		}
		else {
			System.out.println(a+"  is not eligible for vote");
		}
	}
	public static void main(String[]args) {
		Test t=new Test();
		t.vote(20);
	}

}
