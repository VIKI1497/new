package New;

public class InttoString {
	public static void main(String[] args) {
		int number=100;
		//using toString
		String value=Integer.toString(number);
		System.out.println("Using toString :" +value);
		//using String.valueOf
		String value1=String.valueOf(number);
		System.out.println("Using string.valueOf :" +value1);
		//using String.format
		String value2=String.format("%d",number);
		System.out.println("Using string.format :" +value2);
	}

}
