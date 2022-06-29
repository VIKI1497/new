package DEMO;

public class Loop4 {
	public static void main(String[] args) {
		int a=20;
		int oddtotal=0;
		int oddcount=0;
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
				oddtotal=oddtotal+i;
				oddcount++;
			}
		}
		System.out.println("Average of odd="+(oddtotal/oddcount));
	}

}
