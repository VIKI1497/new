package DEMO;

public class Loop14 {
	public static void main(String[] args) {
		String a="ViJaYaLaKsHmI";
		String b=a.toLowerCase();
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b.charAt(i)) {
				count++;
			}
		}
		System.out.println("Lowercase count="+count);
	}

}
