package Condition;

public class Rating {
	public static void main (String[]args) {
		int a=55;
		if (a>=91&&a<=100) {
			System.out.println("KGF-2");
		}
		else if(a>=61&&a<=90) {
			System.out.println("RRR");
		}
		else if(a>=41&&a<=60) {
			System.out.println("BEAST");
		}
		else {
			System.out.println("NOT AVAILABLE");
		}
	}

}
