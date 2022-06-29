package Condition;

public class UseNoteBook {
	public static void main(String[] args) {
		NoteBook b1=new NoteBook();
		b1.price=25;
		b1.noOfPages=84;
		b1.brand="camel";
		b1.isRuled=false;
		
		NoteBook b2=new NoteBook();
		b2.price=35;
		b2.noOfPages=120;
		b2.brand="natraj";
		b2.isRuled=false;
		
		NoteBook b3=new NoteBook();
		b3.price=44;
		b3.noOfPages=142;
		b3.brand="polo";
		b3.isRuled=false;
		
		if (b1.price<b2.price&&b1.price<b3.price) {
			System.out.println("Price="+(b1.price+20)+","+"No Of Pages="+b1.noOfPages+","+"Is Ruled="+b1.isRuled);
		}
		else {
			System.out.println("Price="+b2.price+","+"No Of Pages="+b2.noOfPages);
		}
		
	}

}
