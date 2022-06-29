package Object;

public class UseAc {
	public static void main(String[] args) {
		Ac a1=new Ac();
		a1.brand="samsung";
		a1.price=40000;
		a1.noOfWings=2;
		a1.isWarranty=true;
		//
		Ac a2=new Ac();
		a2.brand="voltas";
		a2.price=38000;
		a2.noOfWings=1;
		a2.isWarranty=true;
		//
		Ac a3=new Ac();
		a3.brand="lg";
		a3.price=36000;
		a3.noOfWings=1;
		a3.isWarranty=true;
		//
		Ac[] acs= {a1,a2,a3};
		for(int i=0;i<acs.length;i++) {
			int tax=2;
			if(acs[i].price<40000) {
				acs[i].price=(acs[i].price*tax/100)+acs[i].price;
			}
				System.out.println("Brand:"+acs[i].brand+" "+"Price:"+acs[i].price+" "+"no of wings:"+acs[i].noOfWings+" "+"isWarranty:"+acs[i].isWarranty);
			
		}
		
	}

}
class Ac {
	String brand;
	int price;
	int noOfWings;
	boolean isWarranty;
}
