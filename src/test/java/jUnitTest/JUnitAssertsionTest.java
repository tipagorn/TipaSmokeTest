package jUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitAssertsionTest {

	@Test
	public void twoPlustwoEqual4() {
		assertEquals(4, 2+2);
		
	}
	
	//@Test //error result
//	public void twoPlustwoEqualFour() {
		//assertEquals("2+2 = 4" ,4, 2+3);
		
	//}
	
	boolean result = true;
	@Test 
	public void testingAssertTrue() {
		assertTrue(result);
	
	}
	@Test 
	public void testingAssertTrueDescription() {
		assertTrue("Result is true", !result);
}
}