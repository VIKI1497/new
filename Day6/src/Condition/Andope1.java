package Condition;

public class Andope1 {
	public static void main(String[]args) {
		int a=100;
		if(a%2==0&&a%50==0) {
			System.out.println(a+"is divisible by both 2 and 50");
		}
		else {
			System.out.println(a+"is not divisible by both 2 and 50");
		}
	}

}
