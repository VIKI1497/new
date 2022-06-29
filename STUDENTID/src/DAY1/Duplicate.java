package DAY1;

public class Duplicate {
	public static void main(String[] args) {
		String value = "malayalam";
		char[] letters = value.toCharArray();
		for (int i = 0; i < value.length() - 1; i++) {
			for (int j = 1 + i; j < value.length() - 1; j++) {
				if (letters[i] == letters[j]) {
					System.out.println("Duplicate character are :" + letters[j]);
					break;
				}
			}
		}
	}

}
