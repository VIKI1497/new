package Functioncall;
class Fridge {
	int price;
	int taxAmount;
	public int netPrice(int price,int taxAmount) {
		return price+taxAmount;
	}
}

public class UseFridge {
	public static void main(String[]args) {
		Fridge f1=new Fridge();
		Fridge f2=new Fridge();
		f1.price=28000;
		f1.taxAmount=1000;
		f2.price=32000;
		f2.taxAmount=800;
		System.out.println(f1.netPrice(f1.price,f1.taxAmount));
		System.out.println(f2.netPrice(f2.price,f2.taxAmount));
		
	}
	

}
