package New;

public class StringCompareToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1="ape";
		String word2="zebra";
		String a="ape";
		String b="Ape";
		System.out.println(word1.compareTo(word2));
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));

	}

}
