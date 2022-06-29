package DEMO;

public class Loop13 {
	public static void main(String[] args) {
		int[] a= {-5,10,-70,6,-8,20};
		int x=0;
		int y=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				System.out.println(a[i]+" is positive number");
				x++;
			}
			else {
				System.out.println(a[i]+" is negative number");
				y++;
			}
		}
		System.out.println("positive count="+x);
		System.out.println("negative count="+y);
	}

}
