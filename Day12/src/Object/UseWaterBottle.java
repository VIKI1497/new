package Object;

public class UseWaterBottle {
	public static void main(String[] args) {
		WaterBottle w1=new WaterBottle();
		w1.price=50;
		w1.brand="puma";
		w1.color="rEd";
		w1.isPlastic=true;
		//
		WaterBottle w2=new WaterBottle();
		w2.price=100;
		w2.brand="Nike";
		w2.color="blue";
		w2.isPlastic=false;
		//
		WaterBottle w3=new WaterBottle();
		w3.price=80;
		w3.brand="Reebok";
		w3.color="red";
		w3.isPlastic=true;
		//
		WaterBottle[] waterbottles= {w1,w2,w3};
		for(int i=0;i<waterbottles.length;i++) {
			if(waterbottles[i].color.equalsIgnoreCase("red")) {
				System.out.println("Brand:"+waterbottles[i].brand+" "+"Price:"+waterbottles[i].price+" "+"color:"+waterbottles[i].color+" "+"is Plastic:"+waterbottles[i].isPlastic);
			}
		}
		
	}

}
class WaterBottle {
	int price;
	String brand;
	String color;
	boolean isPlastic;
}
