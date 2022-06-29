package Object;

public class UseTv {
	public static void main(String[] args) {
		Tv t1=new Tv();
		t1.brand="samsung";
		t1.price=80000;
		t1.color="black";
		t1.inch=38;
		//
		Tv t2=new Tv();
		t2.brand="redmiTv";
		t2.price=50000;
		t2.color="grey";
		t2.inch=36;
		//
		Tv t3=new Tv();
		t3.brand="TCL";
		t3.price=40000;
		t3.color="blue";
		t3.inch=32;
		//
		Tv t4=new Tv();
		t4.brand="realmeTv";
		t4.price=45000;
		t4.color="white";
		t4.inch=36;
		//
		Tv[] tvs= {t1,t2,t3,t4};
		for(int i=0;i<tvs.length;i++) {
			if(tvs[i].price>50000) {
				tvs[i].tax=tvs[i].price*15/100;
				tvs[i].dis=tvs[i].price*10/100;
				tvs[i].netPrice=tvs[i].price+tvs[i].tax-tvs[i].dis;
			System.out.println("Brand:"+tvs[i].brand.toUpperCase()+" "+"color:"+tvs[i].color+" "+"inch:"+tvs[i].inch+" "+"NetPrice:"+tvs[i].netPrice);
		}
		else {
			tvs[i].tax=tvs[i].price*10/100;
			tvs[i].dis=tvs[i].price*5/100;
			tvs[i].netPrice=tvs[i].price+tvs[i].tax-tvs[i].dis;
			System.out.println("Brand:"+tvs[i].brand.toUpperCase()+" "+"color:"+tvs[i].color+" "+"inch:"+tvs[i].inch+" "+"NetPrice:"+tvs[i].netPrice);
		}
		}
		
	}

}
class Tv {
	String brand;
	int price;
	String color;
	int inch;
	int tax;
	int dis;
	int netPrice;
}
