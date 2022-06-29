package DEMO;

public class Loop1 {
	public static void main(String[] args) {
		int a=20;
		int eventotal=0;
		int oddtotal=0;
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
				eventotal=eventotal+i;
			}
		}
		for(int i=0;i<=a;i++) {
			if(i%2!=0) {
				oddtotal=oddtotal+i;
			}
		}
		System.out.println("Total of even number:"+eventotal);
		System.out.println("Total of odd number:"+oddtotal);
	}

}
