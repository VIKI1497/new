package Oops;

public class UseEmployee {
	public static void main(String[]args) {
		Employee e1=new Employee();
		e1.setname("kumaran");
		e1.setid(2233);
		e1.setaddress("130,igp street, igp");
		System.out.println("Name: "+e1.getname()+", "+"ID: "+e1.getid()+", "+"Address: "+e1.getaddress());
	}

}
