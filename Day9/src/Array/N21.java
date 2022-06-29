package Array;

public class N21 {
	public static void main(String[]args) {
		String[] a= {"bristol","gothenberg","malmo","cardif","eastham","fojrd"};
		String rev="";
		for (int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
	}
	

}
