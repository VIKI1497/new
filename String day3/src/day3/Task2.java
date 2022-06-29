package day3;

public class Task2 {
	public static void main (String[]args) {
		String name="JHONY";
		String[] names=name.split("");
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[4]);
		
		String a="urvasi";
		String b=a.toUpperCase();
		char c=b.charAt(a.length()-2);
		System.out.println(c);
	
		String x="urvasi";
		String[] y=x.split("");
		String z=y[x.length()-2].toUpperCase();
		System.out.println(z);
		
	}

}
