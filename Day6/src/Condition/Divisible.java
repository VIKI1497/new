package Condition;

public class Divisible {
	public static void main(String[]args) {
		int a=20;
	    if (a%2==0&&a%5==0) {
	    	System.out.println(a+" is divisible by both");
	    }
	    else if (a%2==0) {
	    	System.out.println(a+" is divisible by 2");
	    }
	    else if (a%5==0) {
	    	System.out.println(a+" is divisible by 3");
	    }
	    else {
	    	System.out.println(a+" not divisible by both");
	    }
	}

}
