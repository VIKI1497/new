package exception;

public class divide1 {
	public static void main(SampleLengthEh[] args) {
		int num1=15;
		int num2=0; 
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		try {
		int num=num1/num2;
		System.out.println(num);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("somthing");
	}

}
