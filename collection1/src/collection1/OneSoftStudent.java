package collection1;

import java.util.HashMap;
import java.util.Iterator;

public class OneSoftStudent {
	public static void main(String[] args) {
		HashMap<Integer,String> studentDetails=new HashMap<> ();
		studentDetails.put(432,"Rocky");
		studentDetails.put(524, "Ravi");
		studentDetails.put(374, "Ram");
		studentDetails.put(312, "Kavya");
		studentDetails.put(124, "Kavi");
		studentDetails.put(214, "Ramya");
		System.out.println(studentDetails.get(432));
		System.out.println(studentDetails.get(124));
		for(Integer i:studentDetails.keySet()) {
			System.err.println(i);
		}
		for(String j:studentDetails.values()) {
			System.out.println(j);
		}
		studentDetails.forEach((Integer,String)-> System.out.println(Integer+","+String));
		Iterator itr=studentDetails.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator itr1=studentDetails.values().iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
