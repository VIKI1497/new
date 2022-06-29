package New;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseConversion {
	 public static void main(String[] args)
	    {
	  
	        // create a list
	        List<Conversion1>
	            lt = new ArrayList<Conversion1>();
	  
	        // add the member of list
	        lt.add(new Conversion1(1, "Geeks"));
	        lt.add(new Conversion1(2, "For"));
	        lt.add(new Conversion1(3, "Geeks"));
	  
	        // create map with the help of
	        // Object (stu) method
	        // create object of Map class
	        Map<Integer, String> map = new HashMap<>();
	  
	        // put every value list to Map
	        for (Conversion1 stu : lt) {
	            map.put(stu.getId(), stu.getName());
	        }
	  
	        // print map
	        System.out.println("Map  : " + map);
	    }
	}

