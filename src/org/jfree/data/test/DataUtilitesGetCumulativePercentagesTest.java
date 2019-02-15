package org.jfree.data.test;

import static org.junit.Assert.*;

import java.awt.List;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
//import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * <pre>
 * The Class DataUtilitesGetCumulativePercentagesTest.
 *
 * Returns a KeyedValues instance that contains the cumulative percentage values
 * for the data in another KeyedValues instance. The cumulative percentage is each value's
 * cumulative sum's portion of the sum of all the values.
 * eg:
 * Input:
 * Key  Value
 * 0        5
 * 1        9
 * 2        2
 *
 * Returns:
 * Key  Value
 * 0     0.3125 (5 / 16)
 * 1     0.875 ((5 + 9) / 16)
 * 2     1.0 ((5 + 9 + 2) / 16)
 * The percentages are values between 0.0 and 1.0 (where 1.0 = 100%).
 *
 * Parameters:
 * data - the data (null not permitted).
 *
 * Returns:
 * The cumulative percentages.
 * Throws:
 * InvalidParameterException - if invalid data object is passed in.
 * </pre>
 */
public class DataUtilitesGetCumulativePercentagesTest extends DataUtilities {
	
	/** The mocking context. */
	private Mockery	mockingContext;
	
	/** The mocked dependancy. */
	KeyedValues		mockedDependancy;
	
	/** The mocking context. */
	private Mockery	mockingContext2;
	
	/** The mocked dependancy. */
	KeyedValues		mockedDependancy2;
	
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
	 * Sets the up. METHODS TO SIMULATE:
	 * 
	 * // int getIndex(java.lang.Comparable) // java.util.List getKeys() //
	 * java.lang.Comparable getKey(int) // java.lang.Number
	 * getValue(java.lang.Comparable
	 * 
	 * // Methods inherited from interface :org.jfree.data.Values // getItemCount,
	 * getValue
	 * 
	 * @throws Exception the exception
	 */
	
	@Before
	public void setUp() throws Exception {
		mockingContext = new Mockery();
		mockedDependancy = mockingContext.mock(KeyedValues.class);
		// don't know if need below, but eh...
		mockingContext2 = new Mockery();
		mockedDependancy2 = mockingContext2.mock(KeyedValues.class);
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
	 * Gets the cumulative percentage test empty list.
	 * 
	 * WARNING: ACTUAL RESULTS UNPREDICTABLE!!!
	 * 
	 * @return the cumulative percentage test empty list
	 */
	@Test
	public void getCumulativePercentageTestEmptyList() {
		/*
		 * Input: (0,?)
		 * 
		 * Output: (0,?)
		 */
		mockingContext.checking(new Expectations() {
			{
				allowing(mockedDependancy).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy).getValue(0);
				will(returnValue(null));
			}
		});
		KeyedValues mine = DataUtilities.getCumulativePercentages(mockedDependancy);
		
		mockingContext2.checking(new Expectations() {
			{
				allowing(mockedDependancy2).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy2).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy2).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy2).getValue(0);
				will(returnValue(null));
			}
		});
		
		assertEquals(mockedDependancy.getIndex(0), mine.getIndex(0));
		assertEquals(mockedDependancy.getKeys(), mine.getKeys());
		assertEquals(mockedDependancy.getKey(0), mine.getKey(0));
		assertEquals(mockedDependancy.getValue(0), mine.getValue(0));
	}
	
	/**
	 * Gets the cumulative percentage test negative values.
	 *
	 * @return the cumulative percentage test negative values
	 */
	@Test
	public void getCumulativePercentageTestNegativeValues() {
		/*
		 * Input: (0,0) (1,1) (2,2) (3,3)
		 * 
		 * Output: (0,0) (1,1) (2,2) (3,3)
		 */
		mockingContext.checking(new Expectations() {
			{
				allowing(mockedDependancy).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy).getValue(0);
				will(returnValue(null));
			}
		});
		KeyedValues mine = DataUtilities.getCumulativePercentages(mockedDependancy);
		
		mockingContext2.checking(new Expectations() {
			{
				allowing(mockedDependancy2).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy2).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy2).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy2).getValue(0);
				will(returnValue(null));
			}
		});
		
		assertEquals(mockedDependancy.getIndex(0), mine.getIndex(0));
		assertEquals(mockedDependancy.getKeys(), mine.getKeys());
		assertEquals(mockedDependancy.getKey(0), mine.getKey(0));
		assertEquals(mockedDependancy.getValue(0), mine.getValue(0));
	}
	
	/**
	 * Gets the cumulative percentage test null values.
	 *
	 * @return the cumulative percentage test null values
	 */
	@Test
	public void getCumulativePercentageTestNullValues() {
		/*
		 * (0,0) (1,1) (2,2) (3,3)
		 */
		mockingContext.checking(new Expectations() {
			{
				allowing(mockedDependancy).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy).getValue(0);
				will(returnValue(null));
			}
		});
		KeyedValues mine = DataUtilities.getCumulativePercentages(mockedDependancy);
		
		mockingContext2.checking(new Expectations() {
			{
				allowing(mockedDependancy2).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy2).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy2).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy2).getValue(0);
				will(returnValue(null));
			}
		});
		
		assertEquals(mockedDependancy.getIndex(0), mine.getIndex(0));
		assertEquals(mockedDependancy.getKeys(), mine.getKeys());
		assertEquals(mockedDependancy.getKey(0), mine.getKey(0));
		assertEquals(mockedDependancy.getValue(0), mine.getValue(0));
	}
	
	/**
	 * Gets the cumulative percentage test non numeric.
	 *
	 * @return the cumulative percentage test non numeric
	 */
	
	@Test
	public void getCumulativePercentageTestNonNumeric() {
		/*
		 * (0,0) (1,1) (2,2) (3,3)
		 */
		mockingContext.checking(new Expectations() {
			{
				allowing(mockedDependancy).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy).getValue(0);
				will(returnValue(null));
			}
		});
		KeyedValues mine = DataUtilities.getCumulativePercentages(mockedDependancy);
		
		mockingContext2.checking(new Expectations() {
			{
				allowing(mockedDependancy2).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy2).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy2).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy2).getValue(0);
				will(returnValue(null));
			}
		});
		
		assertEquals(mockedDependancy.getIndex(0), mine.getIndex(0));
		assertEquals(mockedDependancy.getKeys(), mine.getKeys());
		assertEquals(mockedDependancy.getKey(0), mine.getKey(0));
		assertEquals(mockedDependancy.getValue(0), mine.getValue(0));
	}
	
	/**
	 * Gets the cumulative percentage test expected values.
	 *
	 * @return the cumulative percentage test expected values
	 */
	
	@Test
	public void getCumulativePercentageTestExpectedValues() {
		/*
		 * (0,0) (1,1) (2,2) (3,3)
		 */
		mockingContext.checking(new Expectations() {
			{
				allowing(mockedDependancy).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy).getValue(0);
				will(returnValue(null));
			}
		});
		KeyedValues mine = DataUtilities.getCumulativePercentages(mockedDependancy);
		
		mockingContext2.checking(new Expectations() {
			{
				allowing(mockedDependancy2).getIndex(0);
				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
				allowing(mockedDependancy2).getKeys();
				will(returnValue(new List()));
				allowing(mockedDependancy2).getKey(0);
				will(returnValue(null));
				allowing(mockedDependancy2).getValue(0);
				will(returnValue(null));
			}
		});
		
		assertEquals(mockedDependancy.getIndex(0), mine.getIndex(0));
		assertEquals(mockedDependancy.getKeys(), mine.getKeys());
		assertEquals(mockedDependancy.getKey(0), mine.getKey(0));
		assertEquals(mockedDependancy.getValue(0), mine.getValue(0));
	}
}
