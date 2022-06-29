package DEMO;

public class R1 {
	public static void main(String[]args) {
		String a="MADAM";
		char[] b=a.toCharArray();
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]=='A') {
			count++;
		}
		}
		System.out.println(count);
	}

}
