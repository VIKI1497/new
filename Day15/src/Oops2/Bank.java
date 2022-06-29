package Oops2;

public class Bank {
	public int loanAvailability() {
		return 30000;
	}
	public int loanAvailability(int salary) {
		return 30000+salary;
	}
	public int loanAvailability(int salary,int noOfProperty) {
		return 30000+salary+(salary*noOfProperty/100);
	}

}
