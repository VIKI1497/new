package New;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UseCustomer {

	public static void main(String[] args) {
		List<Customer> customers=EkartDatabase.getAll();
		//map()-> one to one mapping
		List<String> emails=customers.stream().map(x->x.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		//set
		Set<String> emailsSet=customers.stream().map(x->x.getEmail()).collect(Collectors.toSet());
		System.out.println(emailsSet);
		System.out.println();
		//one to many use -> flat map()
		List<List<String>> mobileNumbers=customers.stream().map(x->x.getPhoneNo()).collect(Collectors.toList());
		System.out.println(mobileNumbers);
		System.out.println();
		//
		List<String> numbers=customers.stream().flatMap(x->x.getPhoneNo().stream()).collect(Collectors.toList());
		System.out.println(numbers);
		//using set
		Set<String> number=customers.stream().flatMap(x->x.getPhoneNo().stream()).collect(Collectors.toSet());
		System.out.println(number);

	}

}
