package Day8;

public class R4 {
	public static void main(String[] args) {
		int num=1575;
		int temp=0;
		for(;num>0;) {
			int val=num%10;
			temp=temp+val;
			num=num/10;
		}
		System.out.println(temp);
	}

}
