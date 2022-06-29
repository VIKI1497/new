package day3;

public class Smethod1 {
	public static void main(String[]args) {
		String name="diamond";
		String[] x=name.split("m");
		int y=x.length;
		System.out.println(x[y-1]);
		System.out.println(y);
		System.out.println(x[0]);
		
		String p="television";
		char[] q=p.toCharArray();
		int r=q.length;
		System.out.println(r);
		System.out.println(q[r-1]);
		System.out.println(q[1]);
		
		String d=p.substring(0,r/2);
		System.out.println(d);
		String e=p.substring(r/2,r);
		System.out.println(e);
		char ab=p.charAt(r-1);
		System.out.println(ab);
		char ac=p.charAt(r-5);
		System.out.println(ac);
		
		
		
		
	}

}
