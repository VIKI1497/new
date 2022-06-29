package New;

import java.util.Arrays;

public class AnagramType1 {
	public static void main(String[] args) {
		String a="HE Is aRadHYa";
		String b="is he HraDaya";
		a=a.replace(" ", "");
		b=b.replace(" ", "");
		a=a.toLowerCase();
		b=b.toLowerCase();
		char[] x=a.toCharArray();
		char[] y=b.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		boolean result=Arrays.equals(x, y);
		if(result==true) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		}

}
