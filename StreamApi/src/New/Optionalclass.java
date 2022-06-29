package New;

import java.util.Optional;

public class Optionalclass {

	public static void main(String[] args) {
		String[] value=new String[10];
		Optional<String> checkNull=Optional.ofNullable(value[4]);
		if(checkNull.isPresent()) {
			String str=value[4].toLowerCase();
			System.out.println(str);
		}
		else {
			System.out.println("value is Null");
		}

	}

}
