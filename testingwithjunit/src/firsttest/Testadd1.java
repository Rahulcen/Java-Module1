package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testadd1 {
	static Calculate calc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc=new Calculate();
		System.out.println("before test executed....");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after excuting all  test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each cases");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test");
	}
	


	@Test
	public void testAdd() {
		int inputBase=5;
		int exp=3;
		int expectedValue=8;
		int actualValue=calc.add(inputBase,exp);
		assertEquals(expectedValue,actualValue);
		
	}

}
