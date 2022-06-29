package Array;

public class N15 {
	public static void main(String[]args) {
		int[] a= {26,5,17,23,29,8,14,28,32,4};
		int b=0;
		for(int i=a.length-1;i>=a.length/2;i--) {
			b=b+a[i];
		}
		System.out.println(b);
	}

}
