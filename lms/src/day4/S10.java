package day4;

public class S10 {
	public static void main(String[]args) {
		String[]a=args[0].split(",");
		int b=Integer.parseInt(a[0]);
		int c=Integer.parseInt(a[1]);
		int d=Integer.parseInt(a[2]);
		int e=Integer.parseInt(a[3]);
		int f=Integer.parseInt(a[4]);
		int g=Integer.parseInt(a[5]);
		System.out.println((b+c+d+e+f+g)/6);
	}

}
