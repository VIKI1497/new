package Functioncall;

public class Prime {
	public String prime(int a) {
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==2) {
			return "Given number is prime";
		}
		else {
			return "Given number is not prime";
		}
	}
	public static void main(String[]args) {
		Prime p=new Prime();
		System.out.println(p.prime(7));
	}

}
