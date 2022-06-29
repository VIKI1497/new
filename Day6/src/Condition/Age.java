package Condition;

public class Age {
	public static void main(String[]args) {
		int a=19;
		if(a>0&&a<=5) {
			System.out.println(a+" is kids");
		}
		else if(a>5&&a<=10) {
			System.out.println(a+" is child");
		}
		else if(a>10&&a<=18) {
			System.out.println(a+" is children");
			
		}
		else if(a>18&&a<=30) {
			System.out.println(a+" is teenage");
		}
		else {
			System.out.println(a+" is old");
		}
	}

}
