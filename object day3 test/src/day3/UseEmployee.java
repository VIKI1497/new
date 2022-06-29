package day3;

public class UseEmployee {
	public static void main(String[]args) {
		Employee E1=new Employee();
		E1.employeeId=124;
		E1.employeeName="KAVIN";
		E1.dateOfBirth="12/02/1996";
		E1.mobileNo=9845398453l;
		System.out.println("Employee Id ="+E1.employeeId);
		System.out.println("Employee Name ="+E1.employeeName);
		System.out.println("Date Of Birth ="+E1.dateOfBirth);
		System.out.println("mobile No =+91"+" "+E1.mobileNo);
		
		Employee E2=new Employee();
		E2.employeeId=144;
		E2.employeeName="ARUN";
		E2.dateOfBirth="10/06/1996";
		E2.mobileNo=9678210454l;
		System.out.println("Employee Id ="+E2.employeeId);
		System.out.println("Employee Name ="+E2.employeeName);
		System.out.println("Date Of Birth ="+E2.dateOfBirth);
		System.out.println("mobile No =+91"+" "+E2.mobileNo);
	}

}
