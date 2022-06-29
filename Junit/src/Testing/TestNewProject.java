package Testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestNewProject {
	NewProject pro=new NewProject();
	@Before
	public void beforeCase() {
		System.out.println("Welcome");
	}
	@Test
	public void prime() {
		pro.prime();
	}
	@Test
	public void palindrome() {
		pro.palindrome();
	}
	@After
	public void afterCase() {
		System.out.println("Thank you!!");
	}
	

}
