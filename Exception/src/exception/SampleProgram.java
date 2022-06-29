package exception;

public class SampleProgram {
	public static void main(String[] args) {
		
	String[] value={"10","10ra","0","Hello"};
	try {
		int num1=Integer.parseInt(value[0]);
		int num3=Integer.parseInt(value[2]);
	int num2=Integer.parseInt(value[1]);
	int num=num1/num3;
	System.out.println(num);
	System.out.println(num2+1);
	System.out.println(value[4]);
	}catch(NumberFormatException n) {
		n.printStackTrace();
    }catch(ArithmeticException a) {
	    a.printStackTrace();
    }catch(ArrayIndexOutOfBoundsException ar) {
    	ar.printStackTrace();
    }
	finally {
		System.out.println("Run Always");
	}
	System.out.println("Number Format Exception Handled");
	System.out.println("Arithmetic Exception Handled");
	System.out.println("Array index Out of bounds Exception Handled");
	}
}
