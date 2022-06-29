package Testing;

public class NewProject {
	public void prime() {
		int num=4;
		boolean b=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				b=false;
			}
		}
		if(b==true) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}
	public void palindrome() {
		String value="mam";
		String temp="";
		for(int i=value.length()-1;i>=0;i--) {
			temp=temp+value.charAt(i);
		}
		if(value.equals(temp)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
