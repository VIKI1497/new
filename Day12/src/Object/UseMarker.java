package Object;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.price=20;
		m1.brand="camlin";
		m1.color="Black";
		
		Marker m2=new Marker();
		m2.price=30;
		m2.brand="Hero";
		m2.color="red";

		//
		Marker[] markers= {m1,m2};
		int max=0;
		String a="";
		for(int i=0;i<markers.length;i++) {
		if(markers[i].price>max) {
			max=markers[i].price;
			a=markers[i].brand;
		}
		}
		System.out.println(max+" is highest.");
		System.out.println("Brand:"+a);
			
	}

}
class Marker {
	int price;
	String brand;
	String color;
}