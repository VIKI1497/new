package object;

public class UseTshirt {
	public static void main(String[]args) {
		Tshirt T1=new Tshirt();
		T1.brand="PUMA";
		T1.type="HOODIES";
		T1.colour="grey";
		T1.size='M';
		T1.price=1200;
		T1.discount=75;
		T1.gst=100;
		T1.netAmount=T1.price+T1.gst-T1.discount;
		System.out.println("Tshirt Brand ="+T1.brand+","+"Type ="+T1.type+","+"Colour ="+T1.colour+","+"Size ="+T1.size+","+"Price ="+T1.price+","+"Gst ="+","+T1.gst+","+"Discount ="+T1.discount+","+"Net Amount ="+T1.netAmount );
		
	}

}
