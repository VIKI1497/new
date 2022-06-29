package collection;

import java.util.ArrayList;

public class UseElection {
	public static void main(String[] args) {
		Election election1=new Election("palani",43,123,43000,"admk");
		Election election2=new Election("vel",45,145,54000,"admk");
		Election election3=new Election("stalin",48,231,60000,"dmk");
		Election election4=new Election("udhay",32,324,30000,"dmk");
		Election election5=new Election("palanivel",40,212,51000,"dmk");
		ArrayList<Election> electors=new ArrayList<>();
		electors.add(election1);
		electors.add(election2);
		electors.add(election3);
		electors.add(election4);
		electors.add(election5);
		ArrayList<Election> party=new ArrayList<>();
		for(int i=0;i<electors.size();i++) {
			if(electors.get(i).getCandidateParty().equals("dmk")) {
				party.add(electors.get(i));
			}
		}
		System.out.println(party);
	}

}
