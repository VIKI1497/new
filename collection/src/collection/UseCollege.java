package collection;

import java.util.ArrayList;

public class UseCollege {
	public static void main(String[] args) {
		Address a1=new Address(6000097,"perungudi","chennai");
		Address a2=new Address(600095,"guindy","chennai");
		College c1=new College("vels",3113,a1);
		College c2=new College("dhanalakshmi",3142,a2);
		ArrayList<College> colleges=new ArrayList<> ();
		colleges.add(c1);
		colleges.add(c2);
		System.out.println(colleges);
	}

}
