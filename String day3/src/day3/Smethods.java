package day3;

public class Smethods {
	public static void main(String[]Args) {
		String name="onesoft";
		String name1=name.toUpperCase();
		char a=name1.charAt(name.length()-3);
		System.out.println(a);
		
		String []values= {"raj","ram","rocky"};
		int b=values[2].length();
		System.out.println(b);
		
		String x="ONESOFT";
		String y=x.toLowerCase();
		char z=y.charAt(x.length()-2);
		System.out.println(z);
		
		String p="welcome";
		String q="you";
		String r=p.concat(q);
		String s=r.toUpperCase();
		int u=s.length();
		int t=s.indexOf('Y');
		System.out.println(r);
		System.out.println(s);
		System.out.println(u);
		System.out.println(t);
		
		String w="vignesh";
		int d=w.length();
		String h=w.substring(0,d/2);
		String raj=w.substring(d/2,d);
		System.out.println(raj);
		System.out.println(h);
		
		String[] c=w.split("n");
		int j=c.length;
		System.out.println(c[j-1]);
		
		
		
	}

}
