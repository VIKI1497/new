package Condition;

public class Program {
	public static void main(String[]args) {
		String a="JAVA";
		if (a.equals("JAVA")) {
			System.out.println("High Level Language");
		}
		else if(a.equals("PYTHON")) {
			System.out.println("Advance Level Language");
		}
		else if(a.equals("C++")) {
			System.out.println("Low Level Language");
		}
		else {
			System.out.print(false);
		}
	}

}
