package Oops;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setname("david");
		s1.setrollno(13);
		s1.setphoneno(9098432154l);
		//
		Student s2=new Student();
		s2.setname("ram");
		s2.setrollno(24);
		s2.setphoneno(9821056418l);
		//
		System.out.println("Name: "+s1.getname()+", "+"RollNo: "+s1.getrollno()+", "+"PhoneNo: "+s1.getphoneno());
		System.out.println("Name: "+s2.getname()+", "+"RollNo: "+s2.getrollno()+", "+"PhoneNo: "+s2.getphoneno());
	}

}
