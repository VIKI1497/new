package Day8;

public class L7 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		for (int i=0;i<=5;i++) {
			System.out.println(a);
			c=a+b;
		    b=a;
		    a=c;
		}
	}
}
