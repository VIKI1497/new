package DEMO;

public class Loop11 {
	public static void main(String[] args) {
		int[] a= {5,10,70,6,8,20};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
