package Condition;

public class Neutral {
	public static void main(String[]args) {
		int a=0;
		if (a>0) {
			System.out.println(a+" is positive number");
		}
		else if (a<0) {
			System.out.println(a+" is negative number");
		}
		else if(a==0) {
			System.out.println(a+" is neutral");
		}
		else {
			System.out.println(a+"******");
		}
	}

}
