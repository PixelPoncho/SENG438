package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class DataUtilitiesCalculateRowTotalTest.
 */
public class DataUtilitiesCreateNumberArray extends DataUtilities {
	
	/** The mocking context. */
	private Mockery	mockingContext;
	
	/** The mocked dependancy. */
	Values2D		mockedDependancy;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	/**
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		mockingContext = new Mockery();
		mockedDependancy = mockingContext.mock(Values2D.class);
	}
	
	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	// I have no idea what is supposed to happen, but it appears to treat the null
	// as a 1
	/**
	 * Calculate row total one null value.
	 */
	// This case is not covered by the requirements... are we supposed to do it
	// still?
	@Test
	public void createNumberArray() {
		double[] testInput = { 2.0, 3.0 };
		Number[] testOutput = { 2.0, 3.0 };
	
		
		Number[] result = DataUtilities.createNumberArray(testInput);
		
		assertArrayEquals(testOutput, result);
	}
	
	/**
	 * Calculate row total for null values 2 D.
	 */
	@Test(expected = InvalidParameterException.class)
	public void calculateRowTotalForNullValues2D() {
		
		double result = DataUtilities.calculateRowTotal(null, 0);
	}
	
}
