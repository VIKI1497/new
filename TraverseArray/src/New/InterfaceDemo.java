package New;
@FunctionalInterface
public interface InterfaceDemo {
	public void test();
	public default void test1() {
		System.out.println("Hi I am default method");
	}
	public static void test2() {
		System.out.println("Hi i am static method");
	}

}
