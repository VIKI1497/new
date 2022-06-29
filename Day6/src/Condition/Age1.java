package Condition;

public class Age1 {
	public static void main(String[]args) {
		int a1=28;
		int a2=38;
		int a3=48;
		if (a1>a2&&a1>a3) {
			System.out.println("28");
			
		}
		else if (a2>a1&&a2>a3) {
			System.out.println("38");
		}
		else if (a3>a1&&a3>a2) {
			System.out.println("48");
		}
		else {
			System.out.println("----");
		}
		
		}
	}


