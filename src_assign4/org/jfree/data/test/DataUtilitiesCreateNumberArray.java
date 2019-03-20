package org.jfree.data.test;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

//import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
//import org.jfree.data.Values2D;
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
	
	/**
	 * The mocking context.
	 *
	 * 
	 */
	// private Mockery mockingContext;
	
	/** The mocked dependancy. */
	// Values2D mockedDependancy;
	
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
		// mockingContext = new Mockery();
		// mockedDependancy = mockingContext.mock(Values2D.class);
	}
	
	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Creates the number array basic.
	 */
	@Test
	public void createNumberArrayBasic() {
		double[] testInput = { 2.0, 3.0 };
		Number[] testOutput = { 2.0, 3.0 };
		
		Number[] result = DataUtilities.createNumberArray(testInput);
		
		assertArrayEquals(testOutput, result);
	}
	
	/**
	 * Creates the number array null input.
	 */
	@Test
	public void createNumberArrayNullInput() {
		double[] testInput = {};
		Number[] testOutput = {};
		
		Number[] result = DataUtilities.createNumberArray(testInput);
		
		assertArrayEquals(testOutput, result);
	}
	
	/**
	 * Creates the number array zeros.
	 */
	@Test
	public void createNumberArrayZeros() {
		double[] testInput = { 0.0, 0.0 };
		Number[] testOutput = { 0.0, 0.0 };
		
		Number[] result = DataUtilities.createNumberArray(testInput);
		
		assertArrayEquals(testOutput, result);
	}
	
	/**
	 * Creates the number array one zero.
	 */
	@Test
	public void createNumberArrayOneZero() {
		double[] testInput = { 0.0 };
		Number[] testOutput = { 0.0 };
		
		Number[] result = DataUtilities.createNumberArray(testInput);
		
		assertArrayEquals(testOutput, result);
	}
	
	/**
	 * Creates the number array negative.
	 */
	@Test
	public void createNumberArrayNegative() {
		double[] testInput = { -10.0 };
		Number[] testOutput = { -10.0 };
		
		Number[] result = DataUtilities.createNumberArray(testInput);
		
		assertArrayEquals(testOutput, result);
	}
	
	/**
	 * Creates the number array some negative.
	 */
	@Test
	public void createNumberArraySomeNegative() {
		double[] testInput = { -10.0, 3.0, -2.0, 9.0 };
		Number[] testOutput = { -10.0, 3.0, -2.0, 9.0 };
		
		Number[] result = DataUtilities.createNumberArray(testInput);
		
		assertArrayEquals(testOutput, result);
	}
	
	/**
	 * Creates the number array 2 D basic.
	 */
	@Test
	public void createNumberArray2DBasic() {
		double[][] testInput = { { 2.0, 3.0 }, { 4.0, 5.0 } };
		Number[][] testOutput = { { 2.0, 3.0 }, { 4.0, 5.0 } };
		
		Number[][] result = DataUtilities.createNumberArray2D(testInput);
		
		assertArrayEquals(testOutput[0], result[0]);
		assertArrayEquals(testOutput[1], result[1]);
	}
	
	/**
	 * Creates the number array 2 D negative.
	 */
	@Test
	public void createNumberArray2DNegative() {
		double[][] testInput = { { -2.0, -3.0 }, { -4.0, -5.0 }, { -6.0, -7.0 } };
		Number[][] testOutput = { { -2.0, -3.0 }, { -4.0, -5.0 }, { -6.0, -7.0 } };
		
		Number[][] result = DataUtilities.createNumberArray2D(testInput);
		
		assertArrayEquals(testOutput[0], result[0]);
		assertArrayEquals(testOutput[1], result[1]);
		assertArrayEquals(testOutput[2], result[2]);
	}
	
	/**
	 * Creates the number array 2 D some negative.
	 */
	@Test
	public void createNumberArray2DSomeNegative() {
		double[][] testInput = { { -2.0, 3.0 }, { -4.0, -5.0 }, { 6.0, 7.0 } };
		Number[][] testOutput = { { -2.0, 3.0 }, { -4.0, -5.0 }, { 6.0, 7.0 } };
		
		Number[][] result = DataUtilities.createNumberArray2D(testInput);
		
		assertArrayEquals(testOutput[0], result[0]);
		assertArrayEquals(testOutput[1], result[1]);
		assertArrayEquals(testOutput[2], result[2]);
	}
	
	/**
	 * Creates the number array 2 D zeros.
	 */
	@Test
	public void createNumberArray2DZeros() {
		double[][] testInput = { { 0.0, 0.0 }, { 0.0, 0.0 } };
		Number[][] testOutput = { { 0.0, 0.0 }, { 0.0, 0.0 } };
		
		Number[][] result = DataUtilities.createNumberArray2D(testInput);
		
		assertArrayEquals(testOutput[0], result[0]);
		assertArrayEquals(testOutput[1], result[1]);
	}
	
	/**
	 * Creates the number array 2 D one zero.
	 */
	@Test
	public void createNumberArray2DOneZero() {
		double[][] testInput = { { 0.0 } };
		Number[][] testOutput = { { 0.0 } };
		
		Number[][] result = DataUtilities.createNumberArray2D(testInput);
		
		assertArrayEquals(testOutput[0], result[0]);
		// assertArrayEquals(testOutput[1], result[1]);
	}
	
	/**
	 * Creates the number array 2 D null.
	 */
	@Test
	public void createNumberArray2DNull() {
		double[][] testInput = { {} };
		Number[][] testOutput = { {} };
		
		Number[][] result = DataUtilities.createNumberArray2D(testInput);
		
		assertArrayEquals(testOutput[0], result[0]);
	}
	// @Test(expected = InvalidParameterException.class)
	

	
}
