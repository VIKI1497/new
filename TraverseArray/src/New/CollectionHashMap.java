package New;

import java.util.HashMap;

public class CollectionHashMap {
    public static void main(String args[])
    {
        // No need to mention the
        // Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>(10);
        // Initialization of a HashMap using Generic
        HashMap<Integer, String> hm2= new HashMap<Integer, String>(2);
        // Adding elements to object of HashMap
        // using put method
        // HashMap 1
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");
        hm1.put(null, null);
        hm1.put(null, null);
  
        // HashMap 2
        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");
        hm2.put(null, null);
        hm2.put(7, null);
  
        // Printing elements of HashMap 1
        System.out.println("Mappings of HashMap hm1 are : "+ hm1);
  
        // Printing elements of HashMap 2
        System.out.println("Mapping of HashMap hm2 are : "+ hm2);
        System.out.println(hm1.size());
        System.out.println(hm2.size());
    }
}


