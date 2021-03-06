package org.jfree.data.test;

import static org.junit.Assert.*;

import java.awt.List;

import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
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
	// private Mockery mockingContext;
	
	/** The mocked dependancy. */
	// DefaultKeyedValues mockedDependancy;
	
	/** The mocking context. */
	// private Mockery mockingContext2;
	
	/** The mocked dependancy. */
	// DefaultKeyedValues mockedDependancy2;
	
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
	 * should be: INDEX | KEY | VALUE
	 * 
	 * @throws Exception the exception
	 */
	
	@Before
	public void setUp() throws Exception {
		// mockingContext = new Mockery();
		// mockedDependancy = mockingContext.mock(DefaultKeyedValues.class);
		// don't know if need below, but eh...
		// mockingContext2 = new Mockery();
		// mockedDependancy2 = mockingContext2.mock(DefaultKeyedValues.class);
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
		/*
		 * mockingContext.checking(new Expectations() { {
		 * allowing(mockedDependancy).getIndex(0); will(returnValue(-1)); // Will throw
		 * java.lang.IndexOutOfBoundsException allowing(mockedDependancy).getKeys();
		 * will(returnValue(new List())); allowing(mockedDependancy).getKey(0);
		 * will(returnValue(null)); allowing(mockedDependancy).getValue(0);
		 * will(returnValue(null)); } });
		 */
		DefaultKeyedValues input = new DefaultKeyedValues();
		KeyedValues mine = DataUtilities.getCumulativePercentages(input);
		
		/*
		 * mockingContext2.checking(new Expectations() { {
		 * allowing(mockedDependancy2).getIndex(0); will(returnValue(-1)); // Will throw
		 * java.lang.IndexOutOfBoundsException allowing(mockedDependancy2).getKeys();
		 * will(returnValue(new List())); allowing(mockedDependancy2).getKey(0);
		 * will(returnValue(null)); allowing(mockedDependancy2).getValue(0);
		 * will(returnValue(null)); } });
		 */
		DefaultKeyedValues output = new DefaultKeyedValues();
		try {
			assertEquals(output.getIndex(0), mine.getIndex(0));
			assertEquals(output.getKeys(), mine.getKeys());
			assertEquals(output.getKey(0), mine.getKey(0));
			assertEquals(output.getValue(0), mine.getValue(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Gets the cumulative percentage test negative values.
	 *
	 * @return the cumulative percentage test negative values
	 */
	@Test
	public void getCumulativePercentageTestNegativeValues() {
		/*
		 * Input: 0(0,0) 1(1,-1) 2(3,-4)
		 * 
		 * Output: 0(0,0) 1(1,1) 2(3,4)
		 */
		DefaultKeyedValues input = new DefaultKeyedValues();
		// double i = 0.0;
		// input.addValue(key, value);
		Number zero = 0.0;
		Number minOne = -1;
		Number minFour = -4;
		input.addValue(0, zero);
		input.addValue(1, minOne);
		input.addValue(2, minFour);
		/*
		 * mockingContext.checking(new Expectations() { { List myList = new List();
		 * myList.add("0", 0); myList.add("1", -1); myList.add("1", -1);
		 * 
		 * allowing(mockedDependancy).getIndex(0); will(returnValue(0));
		 * allowing(mockedDependancy).getIndex("1"); will(returnValue(1)); //
		 * will(myList.select(0)); // then(returnValue(myList.getSelectedIndex()));//
		 * Will throw // java.lang.IndexOutOfBoundsException
		 * allowing(mockedDependancy).getKey(0); will(returnValue("0"));
		 * allowing(mockedDependancy).getValue(0); will(returnValue(0));
		 * allowing(mockedDependancy).getKey(1); will(returnValue("1"));
		 * allowing(mockedDependancy).getValue(1); will(returnValue(-1));
		 * allowing(mockedDependancy).getKeys(); will(returnValue(myList)); } });
		 */
		KeyedValues mine = DataUtilities.getCumulativePercentages(input);
		DefaultKeyedValues output = new DefaultKeyedValues();
		// Number zero = 0.0;
		Number point2 = .2;
		Number one = 1;
		output.addValue(0, zero);
		output.addValue(1, point2);
		output.addValue(2, one);
		/*
		 * mockingContext2.checking(new Expectations() { { List myList = new List();
		 * myList.add("0", 0); myList.add("1", 1);
		 * 
		 * allowing(mockedDependancy2).getIndex(0); will(returnValue(0));
		 * allowing(mockedDependancy2).getIndex("1"); will(returnValue(1)); //
		 * will(myList.select(0)); // then(returnValue(myList.getSelectedIndex()));//
		 * Will throw // java.lang.IndexOutOfBoundsException
		 * allowing(mockedDependancy2).getKey(0); will(returnValue("0"));
		 * allowing(mockedDependancy2).getValue(0); will(returnValue(0));
		 * allowing(mockedDependancy2).getKey(1); will(returnValue("1"));
		 * allowing(mockedDependancy2).getValue(1); will(returnValue(1));
		 * allowing(mockedDependancy2).getKeys(); will(returnValue(myList)); } });
		 */
		try {
			assertEquals(output.getIndex(0), mine.getIndex(0));
			// assertArrayEquals(output.getKeys(), mine.getKeys());
			assertEquals(output.getKey(0), mine.getKey(0));
			assertEquals(output.getKey(1), mine.getKey(1));
			assertEquals(output.getKey(2), mine.getKey(2));
			assertEquals(output.getValue(0), mine.getValue(0));
			assertEquals(output.getValue(1), mine.getValue(1));
			assertEquals(output.getValue(2), mine.getValue(2));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//	
//	@Test
//	public void getCumulativePercentageTestNegativeValue() {
//		/*
//		 * Input: 0(0,0) 1(1,-1)
//		 * 
//		 * Output: 0(0,0) 1(1,1)
//		 */
//		mockingContext.checking(new Expectations() {
//			{
//				List myList = new List();
//				myList.add("0", 0);
//				myList.add("1", -1);
//				
//				allowing(mockedDependancy).getIndex(0);
//				will(returnValue(0));
//				allowing(mockedDependancy).getIndex("1");
//				will(returnValue(1));
//				// will(myList.select(0));
//				// then(returnValue(myList.getSelectedIndex()));// Will throw
//				// java.lang.IndexOutOfBoundsException
//				allowing(mockedDependancy).getKey(0);
//				will(returnValue("0"));
//				allowing(mockedDependancy).getValue(0);
//				will(returnValue(0));
//				allowing(mockedDependancy).getKey(1);
//				will(returnValue("1"));
//				allowing(mockedDependancy).getValue(1);
//				will(returnValue(-1));
//				allowing(mockedDependancy).getKeys();
//				will(returnValue(myList));
//			}
//		});
//		KeyedValues mine = DataUtilities.getCumulativePercentages(mockedDependancy);
//		
//		mockingContext2.checking(new Expectations() {
//			{
//				List myList = new List();
//				myList.add("0", 0);
//				myList.add("1", 1);
//				
//				allowing(mockedDependancy2).getIndex(0);
//				will(returnValue(0));
//				allowing(mockedDependancy2).getIndex("1");
//				will(returnValue(1));
//				// will(myList.select(0));
//				// then(returnValue(myList.getSelectedIndex()));// Will throw
//				// java.lang.IndexOutOfBoundsException
//				allowing(mockedDependancy2).getKey(0);
//				will(returnValue("0"));
//				allowing(mockedDependancy2).getValue(0);
//				will(returnValue(0));
//				allowing(mockedDependancy2).getKey(1);
//				will(returnValue("1"));
//				allowing(mockedDependancy2).getValue(1);
//				will(returnValue(1));
//				allowing(mockedDependancy2).getKeys();
//				will(returnValue(myList));
//			}
//		});
//		
//		assertEquals(mockedDependancy2.getKeys(), mine.getKeys());
//		assertEquals(mockedDependancy2.getIndex(0), mine.getIndex(0));
//		assertEquals(mockedDependancy2.getKey(0), mine.getKey(0));
//		assertEquals(mockedDependancy2.getValue(0), mine.getValue(0));
//	}
//	
	
//	/**
//	 * Gets the cumulative percentage test null values.
//	 *
//	 * @return the cumulative percentage test null values
//	 */
//	@Test
//	public void getCumulativePercentageTestNullValues() {
//		/*
//		 * Input: 0(0,0) 1(1,-1) 2(3,-4)
//		 * 
//		 * Output: 0(0,0) 1(1,1) 2(3,4)
//		 */
//		DefaultKeyedValues input = new DefaultKeyedValues();
//		// double i = 0.0;
//		// input.addValue(key, value);
//		input.addValue("0", 0.0);
//		input.addValue("1", -1);
//		input.addValue("2", -4);
//		/*
//		 * mockingContext.checking(new Expectations() { { List myList = new List();
//		 * myList.add("0", 0); myList.add("1", -1); myList.add("1", -1);
//		 * 
//		 * allowing(mockedDependancy).getIndex(0); will(returnValue(0));
//		 * allowing(mockedDependancy).getIndex("1"); will(returnValue(1)); //
//		 * will(myList.select(0)); // then(returnValue(myList.getSelectedIndex()));//
//		 * Will throw // java.lang.IndexOutOfBoundsException
//		 * allowing(mockedDependancy).getKey(0); will(returnValue("0"));
//		 * allowing(mockedDependancy).getValue(0); will(returnValue(0));
//		 * allowing(mockedDependancy).getKey(1); will(returnValue("1"));
//		 * allowing(mockedDependancy).getValue(1); will(returnValue(-1));
//		 * allowing(mockedDependancy).getKeys(); will(returnValue(myList)); } });
//		 */
//		KeyedValues mine = DataUtilities.getCumulativePercentages(mockedDependancy);
//		DefaultKeyedValues output = new DefaultKeyedValues();
//		output.addValue("0", 0.0);
//		output.addValue("1", .2);
//		output.addValue("2", .8);
//		/*
//		 * mockingContext2.checking(new Expectations() { { List myList = new List();
//		 * myList.add("0", 0); myList.add("1", 1);
//		 * 
//		 * allowing(mockedDependancy2).getIndex(0); will(returnValue(0));
//		 * allowing(mockedDependancy2).getIndex("1"); will(returnValue(1)); //
//		 * will(myList.select(0)); // then(returnValue(myList.getSelectedIndex()));//
//		 * Will throw // java.lang.IndexOutOfBoundsException
//		 * allowing(mockedDependancy2).getKey(0); will(returnValue("0"));
//		 * allowing(mockedDependancy2).getValue(0); will(returnValue(0));
//		 * allowing(mockedDependancy2).getKey(1); will(returnValue("1"));
//		 * allowing(mockedDependancy2).getValue(1); will(returnValue(1));
//		 * allowing(mockedDependancy2).getKeys(); will(returnValue(myList)); } });
//		 */
//		try {
//			assertEquals(output.getIndex(0), mine.getIndex(0));
//			assertEquals(output.getKeys(), mine.getKeys());
//			assertEquals(output.getKey(1), mine.getKey(1));
//			assertEquals(output.getKey(2), mine.getKey(2));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	/**
//	 * Gets the cumulative percentage test non numeric.
//	 *
//	 * @return the cumulative percentage test non numeric
//	 */
//	
//	@Test
//	public void getCumulativePercentageTestNonNumeric() {
//		/*
//		 * Input: (0,0) (1,1) (2,2) (3,3)
//		 * 
//		 * Output: (0,0) (1,1) (2,2) (3,3)
//		 */
//		mockingContext.checking(new Expectations() {
//			{
//				allowing(mockedDependancy).getIndex(0);
//				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
//				allowing(mockedDependancy).getKeys();
//				will(returnValue(new List()));
//				allowing(mockedDependancy).getKey(0);
//				will(returnValue(null));
//				allowing(mockedDependancy).getValue(0);
//				will(returnValue(null));
//			}
//		});
//		KeyedValues mine = DataUtilities.getCumulativePercentages(mockedDependancy);
//		
//		mockingContext2.checking(new Expectations() {
//			{
//				allowing(mockedDependancy2).getIndex(0);
//				will(returnValue(-1)); // Will throw java.lang.IndexOutOfBoundsException
//				allowing(mockedDependancy2).getKeys();
//				will(returnValue(new List()));
//				allowing(mockedDependancy2).getKey(0);
//				will(returnValue(null));
//				allowing(mockedDependancy2).getValue(0);
//				will(returnValue(null));
//			}
//		});
//		
//		assertEquals(mockedDependancy.getIndex(0), mine.getIndex(0));
//		assertEquals(mockedDependancy.getKeys(), mine.getKeys());
//		assertEquals(mockedDependancy.getKey(0), mine.getKey(0));
//		assertEquals(mockedDependancy.getValue(0), mine.getValue(0));
//	}
	
	/**
	 * Gets the cumulative percentage test expected values.
	 * 
	 * *
	 * 
	 * <pre>
	 * Input:
	 * Key  Value///////////
	 * 0        5////////////
	 * 1        9/////////
	 * 2        2///////////////
	 *
	 * Returns:
	 * Key  Value/////////////
	 * 0     0.3125 (5 / 16)////////////
	 * 1     0.875 ((5 + 9) / 16)//////////////
	 * 2     1.0 ((5 + 9 + 2) / 16)//////////////
	 * 
	 * </pre>
	 *
	 * @return the cumulative percentage test expected values
	 */
	
	@Test
	public void getCumulativePercentageTestExpectedValues() {
		DefaultKeyedValues input = new DefaultKeyedValues();
		// double i = 0.0;
		// input.addValue(key, value);
		// double myFive = 5.0;
		Number five = 5;
		Number nine = 9;
		Number two = 2;
		input.addValue(0, five);
		input.addValue(1, nine);
		input.addValue(2, two);
		/*
		 * mockingContext.checking(new Expectations() { { List myList = new List();
		 * myList.add("0", 0); myList.add("1", -1); myList.add("1", -1);
		 * 
		 * allowing(mockedDependancy).getIndex(0); will(returnValue(0));
		 * allowing(mockedDependancy).getIndex("1"); will(returnValue(1)); //
		 * will(myList.select(0)); // then(returnValue(myList.getSelectedIndex()));//
		 * Will throw // java.lang.IndexOutOfBoundsException
		 * allowing(mockedDependancy).getKey(0); will(returnValue("0"));
		 * allowing(mockedDependancy).getValue(0); will(returnValue(0));
		 * allowing(mockedDependancy).getKey(1); will(returnValue("1"));
		 * allowing(mockedDependancy).getValue(1); will(returnValue(-1));
		 * allowing(mockedDependancy).getKeys(); will(returnValue(myList)); } });
		 */
		KeyedValues mine = DataUtilities.getCumulativePercentages(input);
		DefaultKeyedValues output = new DefaultKeyedValues();
		Number point3 = 0.3125;
		Number point8 = 0.875;
		Number one = 1.0;
		output.addValue(0, point3);
		output.addValue(1, point8);
		output.addValue(2, one);
		/*
		 * mockingContext2.checking(new Expectations() { { List myList = new List();
		 * myList.add("0", 0); myList.add("1", 1);
		 * 
		 * allowing(mockedDependancy2).getIndex(0); will(returnValue(0));
		 * allowing(mockedDependancy2).getIndex("1"); will(returnValue(1)); //
		 * will(myList.select(0)); // then(returnValue(myList.getSelectedIndex()));//
		 * Will throw // java.lang.IndexOutOfBoundsException
		 * allowing(mockedDependancy2).getKey(0); will(returnValue("0"));
		 * allowing(mockedDependancy2).getValue(0); will(returnValue(0));
		 * allowing(mockedDependancy2).getKey(1); will(returnValue("1"));
		 * allowing(mockedDependancy2).getValue(1); will(returnValue(1));
		 * allowing(mockedDependancy2).getKeys(); will(returnValue(myList)); } });
		 */
		try {
			assertEquals(output.getIndex(0), mine.getIndex(0));
			assertEquals(output.getKeys(), mine.getKeys());
			assertEquals(output.getKey(0), mine.getKey(0));
			assertEquals(output.getKey(1), mine.getKey(1));
			assertEquals(output.getKey(2), mine.getKey(2));
			assertEquals(output.getValue(0), mine.getValue(0));
			assertEquals(output.getValue(1), mine.getValue(1));
			assertEquals(output.getValue(2), mine.getValue(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
