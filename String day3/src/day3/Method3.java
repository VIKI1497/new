package day3;

public class Method3 {
	public static void main(String[]args) {
		String name="welcome";
		String name1=name.concat("all");
		String name2=name.concat(name);
		String name3=name.concat(name2);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
	}

}
