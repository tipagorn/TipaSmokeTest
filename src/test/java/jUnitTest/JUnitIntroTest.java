package jUnitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitIntroTest {
	
	@Ignore //is to ignore to run this testing
	@Test
	public void learningTestAnnotation() {
		
		System.out.println("Test1");
	}
	@Test
	public void learningTestAnnotation2() {
		
		System.out.println("Test2");
	}
	@Test
	public void learningTestAnnotation3() {
		
		System.out.println("Test3");
	}
	
	@Before
	public void beforeAnnotation() {
		System.out.println("Create connection!");
	}
	
	@After
	public void afterAnnotation() {
		System.out.println("Close Connection!!");
	}
	
	@BeforeClass //has to be static method
	public static void testBeforeAnnotation() {
		System.out.println("-------------------");
		System.out.println("Before Class");
		System.out.println("-------------------");
	}
	
	@AfterClass //has to be static method
	public static void testAfterAnnotation() {
		System.out.println("-------------------");
		System.out.println("After Class");
		System.out.println("-------------------");
	}

}
