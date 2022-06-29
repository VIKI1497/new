package collection;

import java.util.ArrayList;
import java.util.List;

public class Pen {
	public static void main(String[] args) {
		ArrayList<String> brands=new ArrayList<>();
		brands.add("cello");
		brands.add("parker");
		brands.add("nataraj");
		brands.add("hero");
		brands.add("reynold");
		brands.add("stylish");
		String a="";
		String var="";
		int max=0;
		for(int i=0;i<brands.size();i++) {
			char lastLetter=brands.get(i).charAt(brands.get(i).length()-1);
			System.out.println(lastLetter);
			
		}
		for(String brand:brands) {
			a=a.concat(brand);
			
		}
		for(String brand:brands) {
			if(brand.length()>max) {
				max=brand.length();
				var=brand;
			}
		}
		System.out.println(a);
		System.out.println(var);
	    List<String> bra=brands.subList(0, 3);
	    System.out.println(bra);
	}

}
