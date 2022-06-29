package DEMO;

public class R4 {
	public static void main(String[] args) {
		String[] a= {"gothenbug","Fjord","Ikigai","BRISTOL"};
		for(int i=0;i<a.length;i++) {
			if(a[i].charAt(0)==a[i].charAt(a[i].length()-1)) {
				System.out.println(a[i]);
			}
		}
	}

}
