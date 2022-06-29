package day3;

public class Method9 {
	public static void main(String[]args) {
		String a="hello";
		String b="world!";
		boolean c=a.equalsIgnoreCase("HELLO");
		boolean d=b.equalsIgnoreCase("WORLD");
		boolean e=b.equalsIgnoreCase("WORLD!");
		boolean f=a.equalsIgnoreCase("HeLlO");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
