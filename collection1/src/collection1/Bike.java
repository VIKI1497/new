package collection1;

import java.util.HashMap;
import java.util.Iterator;

public class Bike {
	public static void main(String[] args) {
		HashMap<String,String> bikeDetails=new HashMap<> ();
		bikeDetails.put("XU148527AR43511","Dio");
		bikeDetails.put("ER843521FI08563","Activa");
		bikeDetails.put("GIO247651TU7632","Splender");
		bikeDetails.put("HJU004123NB64531","CBR");
		for(String i:bikeDetails.keySet()) {
			System.out.println(i);
		}
		bikeDetails.forEach((chassiNo,bike)->System.out.println("Chassi No:"+chassiNo+","+"Bike Name:"+bike));
		Iterator<String> itr=bikeDetails.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
