package DEMO;

public class MandFact {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int max=0;
		int fact=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		for(int j=max;j>0;j--) {
			fact=fact*j;
		}
		System.out.println(fact);
	}

}
