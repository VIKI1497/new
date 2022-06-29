package Testing;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestProject {
	Project p=new Project();
	String value1="ASHOK";
	String value=p.name("ram","raja","ashok");
	@Test
	public void check() {
		assertEquals(value, value1);
	}
	@Test
	public void check1() {
		assertNotNull(value);
	}
}
