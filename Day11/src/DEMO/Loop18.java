package DEMO;

public class Loop18 {
	public static void main(String[] args) {
		String[] x={"rrr","HELLO","ram","Road"};
		for(int i=0;i<x.length;i++) {
			String y=x[i].toUpperCase();
			if(y.contains("A")||y.contains("E")||y.contains("I")||y.contains("O")||y.contains("u")) {
				System.out.println(x[i]+" contains vowels");
			}
			}
		
	}

}
