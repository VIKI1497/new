package exception;

public class SampleLengthEh {
	public static void main(String[] args) {
		String a=null;
		try {
		System.out.println(a.length());
		}
		catch (NullPointerException n) { 
			n.printStackTrace();
		
		}
		System.out.println("null pointer exception handled");
	}

}
