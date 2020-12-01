package de.uulm.first.ui_extension;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionalityTest {

	@Test
	public void meaningOfEverythingTest() {
		assertEquals(42, 40 + 2);
	}
	
	@Test
	public void aSecondTest() {
		assertTrue(true);
	}
	
	@Test
	public void aFailedTest() {
		assertTrue(!false);
	}
	

}
