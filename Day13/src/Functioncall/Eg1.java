package Functioncall;

public class Eg1 {
	public int findMin(int a[]) {
		int min=a[2];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
			min=a[i];
		}
	}
	return min;
	}
	public static void main(String[]args) {
		Eg1 e=new Eg1();
		int[] a= {10,20,30,40,50};
		System.out.println(e.findMin(a));
		
	}

}
