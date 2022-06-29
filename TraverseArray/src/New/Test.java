package New;

public class Test implements InterfaceDemo {
	public static void main(String[] args) {
		InterfaceDemo t=new Test(); //dynamic binding because we create using interface name
		t.test();
		t.test1();
		InterfaceDemo.test2();
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Welome to Java 8 Features");
	}

}
