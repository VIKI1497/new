package Condition;

public class Usepencil {
	public static void main(String[]args) {
		Pencil p1=new Pencil();
		p1.brand="apsara";
		p1.price=10;
		
		Pencil p2=new Pencil();
		p2.brand="natraj";
		p2.price=8;
		
		if (p1.brand.contains("a")||p1.brand.contains("e")||p1.brand.contains("i")||p1.brand.contains("o")||p1.brand.contains("u")) {
			System.out.println("VOWELS");
		}
		else {
			System.out.println("NOT VOWELS");
			
		}
	}

}
