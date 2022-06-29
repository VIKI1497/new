package Day8;

public class L04 {
	public static void main(String[] args) {
		int num=4675;
		int a=0;
		int b=0;
		for(int i=0;i<4;i++) {
			a=num%10;
			b=b+a;
			num=num/10;
			
		}
		System.out.println(b);
	}

}
