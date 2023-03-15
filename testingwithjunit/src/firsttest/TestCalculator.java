package firsttest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculate calc;
		
	
	@Test
	public void testpowerzone() {
		int inputBase =0;
		int exp = 0;
		int expectedValue=0;
		int actualValue = calc.power(inputBase,exp);
		assertEquals(expectedValue,actualValue); 
	}

	@Test
	public void testPower() {
		int inputBase = 2;
		int exp = 3;
		double expectedValue = 8;
		double  actualValue= calc.power(inputBase, exp);
		assertEquals(expectedValue,actualValue);
		//fail("Not yet implemented");
	}
//	public void Testadd1() {
//		int inputBase = 4;
//		int exp = 3;
//		int expexctedValue=7;
//		int actualValue=calc.add(inputBase, exp);
//		assertEquals(expexctedValue, actualValue);
//	}

}
