package org.jfree.data.test;

import static org.junit.Assert.*;

import java.awt.List;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
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
		mockedDependancy = mockingContext.mock(KeyedValues.class);
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
	 * @return the cumulative percentage test empty list
	 */
	@Test
	public void getCumulativePercentageTestEmptyList() {
		//METHODS TO SIMULATE:
			//int getIndex(java.lang.Comparable)
			//java.util.List getKeys()
			//java.lang.Comparable getKey(int)
			//java.lang.Number getValue(java.lang.Comparable
		mockingContext.checking( new Expectations() {
			{
				one(mockedDependancy).getIndex(any(Comparable));
				will(returnValue(-1)); //Will throw java.lang.IndexOutOfBoundsException
				one(mockedDependancy).getKeys();
				will(returnValue(new List());
				one(mockedDependancy).getKey();
				will(returnValue(null));
				one(mockedDependancy).getValue();
				will(returnValue(null));
			}
		});
	}
	
	/**
	 * Gets the cumulative percentage test negative values.
	 *
	 * @return the cumulative percentage test negative values
	 */
	@Test
	public void getCumulativePercentageTestNegativeValues() {
		//METHODS TO SIMULATE:
			//int getIndex(java.lang.Comparable)
			//java.util.List getKeys()
			//java.lang.Comparable getKey(int)
			//java.lang.Number getValue(java.lang.Comparable
			//Methods inherited from interface :org.jfree.data.Values
			//getItemCount, getValue
		mockingContext.checking( new Expectations() {
			{
				one(mockedDependancy).getIndex();
				will(returnValue()); 
				one(mockedDependancy).getKeys();
				will(returnValue();
				one(mockedDependancy).getKey();
				will(returnValue());
				one(mockedDependancy).getValue();
			}
		});
	}
	
	/**
	 * Gets the cumulative percentage test null values.
	 *
	 * @return the cumulative percentage test null values
	 */
	@Test
	public void getCumulativePercentageTestNullValues() {
		//METHODS TO SIMULATE:
			//int getIndex(java.lang.Comparable key)
			//java.util.List getKeys()
			//java.lang.Comparable getKey(int index)
			//java.lang.Number getValue(java.lang.Comparable key)
		mockingContext.checking( new Expectations() {
			{
				one(mockedDependancy).getIndex();
				will(returnValue());
				one(mockedDependancy).getKeys();
				will(returnValue();
				one(mockedDependancy).getKey();
				will(returnValue());
				one(mockedDependancy).getValue();
			}
		});
	}
	
	/**
	 * Gets the cumulative percentage test non numeric.
	 *
	 * @return the cumulative percentage test non numeric
	 */
	@Test
	public void getCumulativePercentageTestNonNumeric() {
		//METHODS TO SIMULATE:
			//int getIndex(java.lang.Comparable)
			//java.util.List getKeys()
			//java.lang.Comparable getKey(int)
			//java.lang.Number getValue(java.lang.Comparable
		mockingContext.checking( new Expectations() {
			{
				one(mockedDependancy).getIndex();
				will(returnValue());
				one(mockedDependancy).getKeys();
				will(returnValue();
				one(mockedDependancy).getKey();
				will(returnValue());
				one(mockedDependancy).getValue();
			}
		});
	}
	
	/**
	 * Gets the cumulative percentage test expected values.
	 *
	 * @return the cumulative percentage test expected values
	 */
	@Test
	public void getCumulativePercentageTestExpectedValues() {
		//METHODS TO SIMULATE:
			//int getIndex(java.lang.Comparable)
			//java.util.List getKeys()
			//java.lang.Comparable getKey(int)
			//java.lang.Number getValue(java.lang.Comparable)
		mockingContext.checking( new Expectations() {
			{
				one(mockedDependancy).getIndex();
				will(returnValue());
				one(mockedDependancy).getKeys();
				will(returnValue();
				one(mockedDependancy).getKey();
				will(returnValue());
				one(mockedDependancy).getValue();
			}
		});
	}
	
}
