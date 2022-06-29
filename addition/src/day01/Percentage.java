package day01;

public class Percentage {
	public static void main(String[]args) {
		int price = 1000;
	    int discount=10;
	    int discountAmount=price*discount/100;
	    int netrate=price-discountAmount;
	    System.out.println("discount Amount is ="+discountAmount);
	    System.out.println("netrate is =" +netrate);
	    
	}

}
