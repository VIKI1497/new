package DEMO;

public class Loop2 {
	public static void main(String[] args) {
		int a=20;
		int oddtotal=0;
		int eventotal=0;
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
				eventotal=eventotal+i;
				evencount++;
			}
			else {
				oddtotal=oddtotal+i;
				oddcount++;
			}
		}
		System.out.println("even total="+eventotal);
		System.out.println("evencount="+evencount);
		System.out.println("odd total="+oddtotal);
		System.out.println("oddcount="+oddcount);
		
	}

}
