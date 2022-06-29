package exception;

public class ProgramFinally {
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
			int num=num1/num2;
			System.out.println(num);
		}catch(ArithmeticException n) {
			n.printStackTrace();
		}
		finally {
			System.out.println("Always run weather exception is handled or not Handled");
		}
		System.out.println("Somthing");
	}
 
}
