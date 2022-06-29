package day4;

public class S9 {
	public static void main (String[]args) {
		 String[] a=args[0].split(",");
		 int x=Integer.parseInt(a[0]);
		 int y=Integer.parseInt(a[1]);
		 int b=Integer.parseInt(args[1]);
		 int c=Integer.parseInt(args[2]);
		 int d=y*b;
		 int e=x+c;
		 System.out.println(d+e);
		 
	}

}
