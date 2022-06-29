package Functioncall;

public class Test5 {
	public int num(int a) {
		int total=0;
		for(int i=0;i<=a;i++) {
			total=total+i;
		}
		return total;
	}
	public static void main(String[]args) {
		Test5 t=new Test5();
		int a=10;
		System.out.println(t.num(a));
	}

}
