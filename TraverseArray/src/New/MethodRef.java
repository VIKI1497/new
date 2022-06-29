package New;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable{
		void print(String msg);
	}

	public class MethodRef {
			public  void display(String msg) {
				msg=msg.toUpperCase();
				System.out.println(msg);
			}
			public static int addition(int a,int b) {
				return a+b;
			}

			public static void main(String[] args) {
				//1.Method Reference to a static method;
				//Lambda expression
				Function<Integer, Double> function=(input)->Math.sqrt(input);
				System.out.println(function.apply(4));
				//Method reference
				Function<Integer, Double> functionRef=Math::sqrt;
				System.out.println(functionRef.apply(9));
				//Lambda Expression for static method
				BiFunction<Integer, Integer, Integer> biFunction=(a,b)->MethodRef.addition(a,b);
				System.out.println(biFunction.apply(30,58));
				//Method Reference for static method
				BiFunction<Integer, Integer, Integer> biFunction1=MethodRef::addition;
				System.out.println(biFunction1.apply(80, 102));
				//2.method Reference to object
				MethodRef methodRef=new MethodRef();
				//Lambda Expression
				Printable printable=(msg)->methodRef.display(msg);
				printable.print("Welcome to java 8 Feature");
				//Method Reference
				Printable printable1=methodRef::display;
				printable1.print("Method Reference");
				//3.method Reference to arbitrary object
				//lambda expression
				Function<String, String> function1=(String input)->input.toLowerCase();
				System.out.println(function1.apply("WELcome"));
				//method reference
				Function<String, String> function2=String::toLowerCase;
				System.out.println(function2.apply("welcome To Method Reference"));
				//4.methods reference to constructor
				List<String> fruits=new ArrayList<>();
				fruits.add("apple");
				fruits.add("mango");
				fruits.add("guva");
				fruits.add("orange");
				fruits.add("watermelon");
				Function<List<String>,Set<String>> setfruit=(list)->new HashSet<>(list);
				System.out.println(setfruit.apply(fruits));
				//using method reference
				Function<List<String>, Set<String>> freshFruits=HashSet::new;
				System.out.println(freshFruits.apply(fruits));
				}

}
