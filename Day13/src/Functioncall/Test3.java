package Functioncall;

public class Test3 {
	public String name(String a) {
		if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
			return a+" have vowels";
		}
		else {
			return a+" have no vowels";
		}
	}
	public static void main(String[]args) {
		Test3 t=new Test3();
	    String a="Hello";
		System.out.println(t.name(a));
	}

}
