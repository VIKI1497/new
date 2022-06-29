package exception;

public class IndexEh {
	public static void main(String[] args) {
		int[] value={10,20,30,40,50};
		try {
			System.out.println(value[5]+5);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
		System.out.println("Array Index Out Of Bound Exception is Handled");
		}
	
	}

