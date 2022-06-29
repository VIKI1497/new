package New;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	 public static void main(String[] args)
	    {
	        // Creating and initializing the ArrayList
	        // Declaring object of integer type
	        List<Integer> numbers = Arrays.asList(1, 2, 3,4, 5, 6, 7, 8);
	 
	        // Iterating using for loop
	        for (int i = 0; i < numbers.size(); i++)
	           
	            // Printing and display the elements in ArrayList
	            System.out.print(numbers.get(i) +" ");       
	    }

}
