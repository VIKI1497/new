package Testing;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class Sample {
	String name="ram";
	String name1="raja";
	String value=null;
	boolean isEqual=name.equals(name);
	boolean isNotEqual=name.equals(name1);
	int[] num= {1,2,3,4,5};
	int[] num1= {1,2,3,4,5};
	@Test
	public void name2() {
		assertEquals("mam", "mam");
	}
	@Test
	public void name3() {
		assertNotEquals("sachin", "baby");
	}
	@Test
	public void check() {
		assertTrue(isEqual);
	}
	@Test
	public void check1() {
		assertFalse(isNotEqual);
	}
	@Test
	public void chec() {
		assertNull(value);
	}
	@Test
	public void chec1() {
		assertNotNull(name);
	}
	@Test
	public void value1() {
		assertSame(name, name);
	}
	@Test
	public void value2() {
		assertNotSame(name1, name);
	}
	@Test
	public void array() {
		assertArrayEquals(num, num1);
	}
}
