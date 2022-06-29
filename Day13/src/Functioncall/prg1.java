package Functioncall;

public class prg1 {
	public String prime(int[] a) {
		int count=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]%i==0) {
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
	public String sq(int[] a) {
		for(int i=0;i<a.length;) {
			int sq=(int) Math.sqrt(a[i]);
			if(sq*sq==a[i]) {
			return "Given number is square";
			}
			else {
				return "Given number is not square";
			}
		}
		return null;
	}
	
public static void main(String[]args) {
	prg1 p=new prg1();
	int[] a= {3,3,25,10,7};
	System.out.println(p.prime(a));
	System.out.println(p.sq(a));
	
	
}

}
