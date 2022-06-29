package day4;

public class HW {
	public static void main(String[]args) {
		String[] a=args[0].split(",");
		System.out.println(a[0].toUpperCase());
		System.out.println(Integer.parseInt(a[1]));
		System.out.println(a[2]);
		System.out.println(a[0].length());
		System.out.println(a.length);
		System.out.println(a[0].charAt(3));
		System.out.println(a[0].substring(1,4));
		System.out.println(a[0].concat(a[2]));
		int y=a[2].indexOf("l");
		System.out.println(y);
		char[]x=a[0].toCharArray();
		System.out.println(x[2]);
		System.out.println((a[0].length()+a[1].length()+a[2].length()));
		
	}

}