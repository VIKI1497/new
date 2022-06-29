package Testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SampleTest {
	@Before
	public void beforeCase() {
		System.out.println("Welcome");
	}
	@Test
	public void test() {
		System.out.println("Hello");
	}
	@Test
	public void test1() {
		System.out.println("Hi");
	}
	@After
	public void aftercase() {
		System.out.println("Thank you!!");
	}

}
