package collection;

import java.util.ArrayList;

public class UseProgrammer {
	public static void main(String[] args) {
		Programmer programmer1=new Programmer("Thilak",304,"Male","Traniee","Java");
		Programmer programmer2=new Programmer("Dinesh",213,"Male","Traniee","C++");
		Programmer programmer3=new Programmer("Kavya",113,"Female","Senior Developer","Java");
		Programmer programmer4=new Programmer("Vinoth",100,"Male","Team Leader","Python");
		Programmer programmer5=new Programmer("Hari",144,"Male","Manager","C++");
		ArrayList<Programmer> programmers=new ArrayList<> ();
		programmers.add(programmer1);
		programmers.add(programmer2);
		programmers.add(programmer3);
		programmers.add(programmer4);
		programmers.add(programmer5);
		ArrayList<Programmer> javaDevelopers=new ArrayList<> ();
		for(Programmer prg:programmers) {
			if(prg.getCodingLanguage().equals("Java")) {
				javaDevelopers.add(prg);
			}
		}
		javaDevelopers.forEach(prg->System.out.println(prg));
	    javaDevelopers.forEach(prg->{ if(prg.getName().startsWith("K")) {
			System.out.println(prg.getId());
		}
		});
	}
}
