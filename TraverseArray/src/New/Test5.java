package New;

import java.util.Arrays;
import java.util.List;

public class Test5 {
	public static void main(String[] args)
    {
        // Declaring and initializing ArrayList
        // Custom input elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> num=numbers.subList(0, 5);
 
        // Printing numbers using lambda expressions
        // been introduced later in java8
        numbers.forEach(number->System.out.println(number));
        num.forEach(x->System.out.println(x));
 
    }

}
