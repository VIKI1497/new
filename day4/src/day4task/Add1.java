package day4task;

public class Add1 {
	public static void main(String[]args) {
		String[] x=args[0].split(",");
		String[] y=args[1].split(",");
		int a=Integer.parseInt(x[0]);
		int b=Integer.parseInt(x[1]);
		int c=Integer.parseInt(y[0]);
		int d=Integer.parseInt(y[1]);
		int e=Integer.parseInt(y[2]);
		int p=(a+c);
		int q=(b+d);
		int r=(p+q);
		System.out.println(r-e);
	}

}
