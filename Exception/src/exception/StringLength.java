package exception;

public class StringLength {
	public static void main(String[] args) {
		String name="kannan";
		try {
			System.out.println(name.charAt(6));
		}catch(StringIndexOutOfBoundsException s) {
			s.printStackTrace();
		}
		finally {
			System.out.println("hello!!");
		}
	}

}
