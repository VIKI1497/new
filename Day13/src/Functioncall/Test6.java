package Functioncall;

public class Test6 {
	public void num(int a) {
		int total=1;
		for(int i=1;i<=6;i++) {
			total=total*i;
		}
		System.out.println(total);
	}
	public static void main(String[]args) {
		Test6 t=new Test6();
		t.num(6);
	}

}
