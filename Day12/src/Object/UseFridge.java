package Object;

public class UseFridge {
	public static void main(String[] args) {
		Fridge f1=new Fridge();
		f1.brand="kelvinator";
		f1.price=35000;
		f1.color="red";
		//
		Fridge f2=new Fridge();
		f2.brand="samsung";
		f2.price=45000;
		f2.color="blue";
		//
		Fridge f3=new Fridge();
		f3.brand="lg";
		f3.price=40000;
		f3.color="grey";
		//
		Fridge[] fridges= {f1,f2,f3};
		for(int i=0;i<fridges.length;i++) {
			int tax=2;
			if(fridges[i].brand.contains("a")||fridges[i].brand.contains("e")||fridges[i].brand.contains("i")||fridges[i].brand.contains("o")||fridges[i].brand.contains("u")) {
				tax=(fridges[i].price*tax/100);
				System.out.println("Brand:"+fridges[i].brand+" "+" Price:"+fridges[i].price+" "+"Color:"+fridges[i].color+" "+"tax:"+tax+" "+"netprice:"+(fridges[i].price+tax));
				
			}
		}
	}

}
class Fridge {
	String brand;
	String color;
	int price;
}
