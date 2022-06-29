package Functioncall;

public class Test9 {
	public String name(String a) {
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equals(b)) {
			return (a+" palindrome");
		}
		else {
			 return (a+" not palindrome");
		}
	}
	public static void main(String[]args) {
		Test9 t=new Test9();
		String a="mam";
		System.out.println(t.name(a));
		
	}

}
