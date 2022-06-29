package collection1;

public class Customer {
	private String name;
	private int age;
	private String email;
	private long accountNumber;
	private int accountBalance;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance=accountBalance;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public Customer(String name,int age,String email,long accountNumber,int accountBalance) {
		this.name=name;
		this.age=age;
		this.email=email;
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
	}
	public String toString() {
		return name+""+age+""+email+""+accountNumber+""+accountBalance;
	}
}
