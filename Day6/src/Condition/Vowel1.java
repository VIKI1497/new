package Condition;

public class Vowel1 {
	public static void main (String[]args) {
		String a="vignesh";
		if (a.contains("a")&&a.contains("i") ) {
			System.out.println(a+" has Vowels a and i");
		}
		else if (a.contains("i")&&a.contains("e")) {
			System.out.println(a+" has Vowels a and e");
		}
		else if (a.contains("o")&&a.contains("e")) {
			System.out.println(a+" has vowels o and e");
		}
		else {
			System.out.println(a+" has no Vowels");
		}
	}

}
