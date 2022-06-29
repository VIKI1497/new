package Condition;

public class Leap {
	public static void main(String[] args) {
		int a=2000;
		if (a%4==0&&a%400==0) {
			System.out.println("Given year is leap year");
		}
		else {
			System.out.println("Given year is not leap year");
		}
	}

}
