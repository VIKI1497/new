package New;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a="ARADHYA";
		String b="HRADAYA";
		char[] x=a.toCharArray();
		char[] y=b.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		Boolean result=Arrays.equals(x, y);
		if(result==true) {
			System.out.println("Strings are Anagram");
		}
		else {
			System.out.println("Strings are not Anagram");
		}

	}

}
