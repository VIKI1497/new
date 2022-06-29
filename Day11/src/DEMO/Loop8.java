package DEMO;

public class Loop8 {
	public static void main(String[] args) {
		int a=10;
		boolean b=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b=false;
			}
		}
		if(b==true) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
	}

}
