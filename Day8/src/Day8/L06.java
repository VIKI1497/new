package Day8;

public class L06 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		for(int i=1;i<=5;i++) {
			System.out.println(b);
			a=(b*10)+i;
			b=a+1;
		}
	}
}
