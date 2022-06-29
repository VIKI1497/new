package Condition;

public class operation {
	public static void main(String[] args) {
		int a=5;
		int b=26;
		String x="add";
		switch (x) {
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
		case "div":
			System.out.println(a/b);
			break;
			default:
				System.out.println("NO OPERATION");
		}
		
	}

}
