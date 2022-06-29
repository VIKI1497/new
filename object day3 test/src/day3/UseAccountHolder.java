package day3;

public class UseAccountHolder {
	public static void main(String[]args) {
		//Person1
		AccountHolder A1=new AccountHolder();
		A1.name="mano";
		A1.age=26;
		A1.gender="male";
		A1.accountNumber=28330485612583l;
		A1.monthlyIncome=21000;
		A1.savingsPercentage=18;
		A1.savingAmount=(A1.monthlyIncome*A1.savingsPercentage)/100;
		System.out.println("Savings Amount Of Mano:"+A1.savingAmount);
		System.out.println();
		//Person2
		AccountHolder A2=new AccountHolder();
		A2.name="savathri";
		A2.age=25;
		A2.gender="Female";
		A2.accountNumber=28330485612584l;
		A2.monthlyIncome=20000;
		A2.savingsPercentage=20;
		A2.savingAmount=(A2.monthlyIncome*A2.savingsPercentage)/100;
		System.out.println("Savings Amount Of Savathri:"+A2.savingAmount);
		System.out.println();
		//Person3
		AccountHolder A3=new AccountHolder();
		A3.name="Kamban";
		A3.age=30;
		A3.gender="male";
		A3.accountNumber=28330485612585l;
		A3.monthlyIncome=30000;
		A3.savingsPercentage=10;
		A3.savingAmount=(A3.monthlyIncome*A3.savingsPercentage)/100;
		System.out.println("Savings Amount Of Kamban:"+A3.savingAmount);
	}

}
