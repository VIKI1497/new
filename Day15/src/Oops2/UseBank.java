package Oops2;

public class UseBank {
	public static void main(String[] args) {
		Bank b1=new Bank();
		System.out.println(b1.loanAvailability());
		System.out.println(b1.loanAvailability(20000));
		System.out.println(b1.loanAvailability(20000,2));
	}

}
