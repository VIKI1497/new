package DEMO;

public class Loop15 {
	public static void main(String[] args) {
		String a="ViJaYaLaKsHmI";
		String b=a.toLowerCase();
		int x=0;
		int y=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(i)) {
				x++;
			}
			else {
				y++;
			}
		}
		System.out.println("Lowercase count="+x);
		System.out.println("Uppercase count="+y);
	}

}
