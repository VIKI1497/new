package day4;
 
public class UseStudent{
	public static void main(String[]args) {
		Student S1=new Student();
		S1.name=args[0];
		S1.id=Integer.parseInt(args[1]);
		S1.mobileNo=Long.parseLong(args[2]);
		S1.height=Float.parseFloat(args[3]);
		System.out.println((S1.name).toUpperCase());
		System.out.println(S1.id);
		System.out.println(S1.mobileNo);
		System.out.println(S1.height);
		
		
		
	}
}


 class Student {
	 String name;
	 int id;
	 long mobileNo;
	 float height;
}
