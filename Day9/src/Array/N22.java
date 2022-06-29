package Array;

public class N22 {
	public static void main(String[] args) {
		String[] a= {"bristol","gothenberg","malmo","cardif","eastham","fojrd"};
		String b="";
		for(int i=a.length-1;i>=0;i--) {
			b=b.concat(a[i]);
		}
		System.out.println(b);
	}

}
