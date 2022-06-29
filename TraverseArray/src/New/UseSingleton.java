package New;

public class UseSingleton {
	public static void main(String[] args) {
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.s);
		if(s1==s2&&s2==s3) {
			System.out.println("has same hashcode");//three object point the same memory location in heap;
		}
	}

}
