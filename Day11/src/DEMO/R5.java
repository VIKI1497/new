package DEMO;

public class R5 {
	public static void main(String[] args) {
		String a="TN0728";
		char[] b=a.toCharArray();
		int countl=0;
		int countn=0;
		for(int i=0;i<b.length;i++) {
			if((b[i]>='a'&&b[i]<='z')||(b[i]>='A'&&b[i]<='Z')) {
				countl++;
				}
			
			else {
				countn++;
			}
			
		}
		System.out.println("number countl:"+countl);
		System.out.println("number countn:"+countn);
	}

}
