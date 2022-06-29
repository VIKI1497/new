package exception;

public class IndexL {
	public static void main(String[] args) {
		String name="jagan";
		try {
			System.out.println(name.indexOf('z'));
		}catch(IndexOutOfBoundsException i) {
			i.printStackTrace();
		}
		finally {
			System.out.println("Index out of bounds exception is handled");
		}
	}

}
