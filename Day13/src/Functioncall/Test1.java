package Functioncall;

public class Test1 {
	public String max(int a,int b,int c) {
		if(a>b&&a>c) {
			return a+" is maximum";
		}
		else if(b>a&&b>c) {
			return b+" is maximum";
		}
		else {
			return c+" is maximum";
		}
	}
	public static void main(String[]args) {
		Test1 t=new Test1();
		System.out.println(t.max(4, 10, 5));
	}

}
