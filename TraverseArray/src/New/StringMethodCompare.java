package New;

public class StringMethodCompare {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("first value:"+Integer.compare(a,b));
		int x=20;
		int y=20;
		System.out.println("second value:"+Integer.compare(x, y));
		int p=40;
		int q=1;
		System.out.println("third value:"+Integer.compare(p, q));
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toHexString(x));
		System.out.println(Integer.toOctalString(x));
	}

}
