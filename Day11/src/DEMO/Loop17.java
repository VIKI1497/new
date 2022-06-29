package DEMO;

public class Loop17 {
	public static void main(String[] args) {
		String x="Vijayalakshmi";
		char[] y=x.toCharArray();
		int count =0;
		for(int i=0;i<y.length;i++) {
			if(y[i]!='a'&&y[i]!='e'&&y[i]!='i'&&y[i]!='o'&&y[i]!='u') {
				System.out.println(y[i]);
				count++;
			}
		}
		System.out.println("vowels="+count);
	}

}
