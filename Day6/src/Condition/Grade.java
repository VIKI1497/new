package Condition;

public class Grade {
	public static void main(String[]args) {
		int a=71;
		if (a>=91&&a<=100) {
			System.out.println("A");
		}
		else if (a>=71&&a<=90) {
			System.out.println("B+");
			}
		else if (a>=41&&a<=70) {
			System.out.println("B");
		}
		else if (a>=0&&a<=40) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
	}

}
