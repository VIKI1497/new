package DEMO;

public class Loop23 {
	public static void main(String[] args) {
		int[] a= {-5,10,70,-6,8,-20};
		int min=a[2];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
