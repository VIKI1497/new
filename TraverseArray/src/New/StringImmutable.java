package New;

public class StringImmutable {
	public static void main(String[] args) {
		String str1="kannan";
		String str2=str1;
		String str3=new String("kannan");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
	}

}
