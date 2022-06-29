package New;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
	static List<Customer> getAll(){
		return Stream.of(
				new Customer(100,"jacob","jacob@gmail.com",Arrays.asList("8741201364","7630254186")),
				new Customer(123,"kelvin","kelvin11@gmail.com",Arrays.asList("7412503680","9920145203")),
				new Customer(118,"lavanya","lavanya@gmail.com",Arrays.asList("8462157530","8862011320")),
				new Customer(106,"varun","varun3@gmail.com",Arrays.asList("7001463512","8860149730")),
				new Customer(111,"naveen","naveen67@gmail.com",Arrays.asList("8762200137","9992045136"))).collect(Collectors.toList());
	}

}
