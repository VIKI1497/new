package Oops2;

public class UseAxisBank {
	public static void main(String[] args) {
		Bank1 b=new Bank1();
		AxisBank ab=new AxisBank();
		System.out.println(ab.interest(20000));
		System.out.println(b.interest(10000));
	}

}
