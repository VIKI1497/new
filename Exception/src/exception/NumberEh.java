package exception;

public class NumberEh {
	public static void main(String[] args) {
		String value="451U";
		try {
		int num=Integer.parseInt(value);
		System.out.println(num+10);
		}
		catch(NumberFormatException n) {
			n.printStackTrace();
		}
		System.out.println("Number format Exception is Handled");

	}

}
