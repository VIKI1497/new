package day01;

public class Tax {
	public static void main(String[]args) {
	int price=1000;
	int discount=10;
	int gst=14;
	int discountAmount=price*discount/100;
	int netrate=price-discountAmount;
	int gstamount=price*gst/100;
	int grossAmount=netrate+gstamount;
	System.out.println("Discount amount =" +discountAmount);
	System.out.println("Gst amount =" +gstamount);
	System.out.println("Gross Amount to be paid =" +grossAmount);
    
	}

}
