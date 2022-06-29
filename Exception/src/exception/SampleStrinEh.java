package exception;

public class SampleStrinEh {
	public static void main(String[] args) {
		String value="Hello";
	char[] letter=value.toCharArray();
	try {
		System.out.println(letter[5]+"hi");
		}
		catch(ArrayIndexOutOfBoundsException s) {
			s.printStackTrace();
		}
		System.out.println("Array Index Out of Bound Exception is Handled");
		
	}

}
