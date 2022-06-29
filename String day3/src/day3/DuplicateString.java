package day3;

public class DuplicateString {
	public static void main(String[] args) {
		String value="member";
		int num=value.length()-1;
		char[] letters=value.toCharArray();
		for(int i=0;i<num;i++) {
			for(int j=1+i;j<num;j++) {
				if(letters[i]==letters[j]) {
					System.out.println("Duplicate character are :"+ letters[j]);
					break;
				}
			}
		}
	} 

}
