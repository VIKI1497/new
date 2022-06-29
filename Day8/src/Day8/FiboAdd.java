package Day8;

public class FiboAdd {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int d=0;
		for (int i=0;i<5;i++) {
			c=a+b;
		    b=a;
		    d=d+c;
		    a=c;
		}
		System.out.println(d);
	}
}


