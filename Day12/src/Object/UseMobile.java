package Object;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.brand="Apple";
		m1.price=20000;
		m1.color="white";
		m1.isWarranty=true;
		//
		Mobile m2=new Mobile();
		m2.brand="Redmi";
		m2.price=15000;
		m2.color="black";
		m2.isWarranty=true;
		//
		Mobile m3=new Mobile();
		m3.brand="oneplus";
		m3.price=13000;
		m3.color="blue";
		m3.isWarranty=false;
		//
		Mobile[] mobiles= {m1,m2,m3};
		for(int i=0;i<mobiles.length;i++) {
			if(mobiles[i].price>15000) {
				mobiles[i].price=mobiles[i].price-(mobiles[i].price*3/100);
			}
				System.out.println("Brand:"+mobiles[i].brand+" "+"color:"+mobiles[i].color+" "+"is Warranty:"+mobiles[i].isWarranty+" "+"Price:"+mobiles[i].price);
			}
			/*else {
				System.out.println("Brand:"+mobiles[i].brand+" "+"color:"+mobiles[i].color+" "+"is Warranty:"+mobiles[i].isWarranty+" "+"Price:"+mobiles[i].price);
			}*/
		
	}

}
class Mobile {
	String brand;
	int price;
	String color;
	boolean isWarranty;
}
