package New;

public class StringMutable {

	public static void main(String[] args) {
		StringBuffer name=new StringBuffer("raavan");
		name.append("kanmani");
		name.replace(0, 6, "karthik");
		System.out.println(name);

	}

}
