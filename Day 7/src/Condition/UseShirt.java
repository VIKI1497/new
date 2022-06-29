package Condition;

public class UseShirt {
	public static void main(String[]args) {
		Shirt s1=new Shirt();
		s1.brand="POLO";
		s1.color="white";
		s1.price=899;
		
		Shirt s2=new Shirt();
		s2.brand="CK";
		s2.color="grey";
		s2.price=1499;
		
		Shirt s3=new Shirt();
		s3.brand="PETER ENGLAND";
		s3.color="blue";
		s3.price=1099;
		
		if (s1.price>s2.price&&s1.price>s3.price) {
			System.out.println("higest price:"+" "+"Brand="+s1.brand+","+"color="+s1.color+","+"Price="+s1.price);
			
		}
		else if (s2.price>s1.price&&s2.price>s3.price) {
			System.out.println("highest price:"+" "+"Brand="+s2.brand+","+"color="+s2.color+","+"Price="+s2.price);
		}
		else if (s3.price>s1.price&&s3.price>s2.price) {
			System.out.println("highest price:"+" "+"Brand="+s3.brand+","+"color="+s3.color+","+"Price="+s3.price);
		}
		
	}

}
