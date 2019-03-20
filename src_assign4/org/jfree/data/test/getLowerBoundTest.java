package org.jfree.data.test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.jfree.data.Range;
import org.junit.Test;

/**
 * The Class getLowerBoundTest.
 */
public class getLowerBoundTest {
	
	/**
	 * Test.
	 */
	@Test
	public void testNegativeLowerBoundLessThanUpper() {
		Range exampleRange = new Range(-1, 1);
		
		Class<Range> rangeClass = Range.class;
		
		double testedLowerBound = exampleRange.getLowerBound();
		
		Field fieldLowerBound = null;
		try {
			fieldLowerBound = rangeClass.getDeclaredField("lower");
			fieldLowerBound.setAccessible(true);
//			fieldLowerBound = rangeClass.getField("org.jfree.data.Range.lower");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// fieldLowerBound.set()
		
		double actualLowerBound = 0;
		try {
			actualLowerBound = fieldLowerBound.getDouble(exampleRange);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// double actualLowerBound =
		assertEquals("Value retrieved through getter and reflection should be the same", actualLowerBound,
				testedLowerBound, .000000001d);
		
	}
	
	
	@Test
	public void testLowerBoundSameAsUpper() {
		Range exampleRange = new Range(0,0);
		
		Class<Range> rangeClass = Range.class;
		
		double testedLowerBound = exampleRange.getLowerBound();
		
		Field fieldLowerBound = null;
		try {
			fieldLowerBound = rangeClass.getDeclaredField("lower");
			fieldLowerBound.setAccessible(true);
//			fieldLowerBound = rangeClass.getField("org.jfree.data.Range.lower");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// fieldLowerBound.set()
		
		double actualLowerBound = 0;
		try {
			actualLowerBound = fieldLowerBound.getDouble(exampleRange);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// double actualLowerBound =
		assertEquals("Value retrieved through getter and reflection should be the same", actualLowerBound,
				testedLowerBound, .000000001d);
		
	}
	
	
	/*Error Thrown By Constructor - change value w. reflection set then check?*/
	/*
	@Test
	public void testLowerBoundGreaterThanUpper() {
		Range exampleRange = new Range(1,0);
		
		Class<Range> rangeClass = Range.class;
		
		double testedLowerBound = exampleRange.getLowerBound();
		
		Field fieldLowerBound = null;
		try {
			fieldLowerBound = rangeClass.getDeclaredField("lower");
			fieldLowerBound.setAccessible(true);
//			fieldLowerBound = rangeClass.getField("org.jfree.data.Range.lower");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// fieldLowerBound.set()
		
		double actualLowerBound = 0;
		try {
			actualLowerBound = fieldLowerBound.getDouble(exampleRange);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// double actualLowerBound =
		assertEquals("Value retrieved through getter and reflection should be the same", actualLowerBound,
				testedLowerBound, .000000001d);
				
		
	}
	*/
	
}
