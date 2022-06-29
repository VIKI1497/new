package Functioncall;

public class Eg {
	public int findMax(int a[]) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[]args) {
		Eg e=new Eg();
		int[] a= {10,20,30,40,50};
		System.out.println(e.findMax(a));
	}

}
