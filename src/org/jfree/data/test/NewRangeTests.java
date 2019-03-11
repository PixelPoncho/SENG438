package org.jfree.data.test;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.Test;

public class NewRangeTests {
	
	/*NEW TESTS*/
	
	/*
	 * Creates Range with lower bound larger than upper
	 * */
	@Test(expected=IllegalArgumentException.class)
	public void rangeWithLowerGreaterThanUpper() {
		double lower = 10;
		double upper = 0;
		new Range(lower, upper);	
	}
	
	/*
	 * Test Constrain when value isnt in range - above range
	 * */
	@Test
	public void constrainValueAboveRange() {
		double lower = -10;
		double upper = 10;
		Range exampleRange = new Range(lower, upper);
		double result = exampleRange.constrain(upper + 1);
		assertEquals("Constrain upper when value out of range", upper, result, .000000001d);
	}
	
	/*
	 * Test Constrain when value isnt in range - below range
	 * */
	@Test
	public void constrainValueBelowRange() {
		double lower = -10;
		double upper = 10;
		Range exampleRange = new Range(lower, upper);
		double result = exampleRange.constrain(lower - 1);
		assertEquals("Constrain lower when value out of range", lower, result, .000000001d);
	}
	
	

}
