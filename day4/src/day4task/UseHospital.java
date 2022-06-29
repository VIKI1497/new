package day4task;

public class UseHospital {
	public static void main(String[]args) {
	Hospital H1=new Hospital();
	H1.name="Apollo";
	H1.location="CHENNAI";
	H1.isAvail24=true;
	System.out.println((H1.name).toUpperCase()+" "+H1.location+" "+H1.isAvail24);
	System.out.println();
	//
	Hospital H2=new Hospital();
	H2.name="Kauvery";
	H2.location="CHENNAI";
	H2.isAvail24=true;
	System.out.println((H2.name).toUpperCase()+" "+H2.location+" "+H2.isAvail24);
	System.out.println();
	//
	Hospital H3=new Hospital();
	H3.name="Sims";
	H3.location="CHENNAI";
	H3.isAvail24=true;
	System.out.println((H3.name).toUpperCase()+" "+H3.location+" "+H3.isAvail24);
	System.out.println();
	System.out.println("length of location is "+(H1.location).length());
	System.out.println();
	System.out.println((H1.name).equals(H2.name));

	}
}
