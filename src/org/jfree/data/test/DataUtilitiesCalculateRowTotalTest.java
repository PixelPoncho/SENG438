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
public class DataUtilitiesCalculateRowTotalTest extends DataUtilities {
	
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
	
	
	/**
	 * Calculate row total one null value.
	 */
	// This case is not covered by the requirements... are we supposed to do it
	// still?
	@Test
	public void calculateRowTotalOneNullValue() {
		mockingContext.checking(new Expectations() {
			{
				one(mockedDependancy).getColumnCount();
				will(returnValue(2));
				one(mockedDependancy).getValue(0, 0);
				will(returnValue(null));
				one(mockedDependancy).getValue(0, 1);
				will(returnValue(5));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(mockedDependancy, 0);
		
		//What am I supposed to assert? There is no defined behaviour for this case
		//ERROR: This works when expecting 6 for some reason?
		assertEquals(5, result, 000000001d);
	}

	/**
	 * Calculate row total with pos and neg data values high postive row value.
	 */
	@Test
	public void calculateRowTotalWithPosAndNegDataValuesHighPostiveRowValue() {
		mockingContext.checking(
				new Expectations() {
			{
				one(mockedDependancy).getColumnCount();
				will(returnValue(2));
				one(mockedDependancy).getValue(Integer.MAX_VALUE, 0);
				will(returnValue(-3.5));
				one(mockedDependancy).getValue(Integer.MAX_VALUE, 1);
				will(returnValue(2.5));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(mockedDependancy, Integer.MAX_VALUE);
		
		assertEquals(-1.0, result, 000000001d);
	}
	
	/**
	 * Calculate row total for two positive values zero row value.
	 */
	@Test
	public void calculateRowTotalForTwoPositiveValuesZeroRowValue() {
		mockingContext.checking(new Expectations() {
			{
				one(mockedDependancy).getColumnCount();
				will(returnValue(2));
				one(mockedDependancy).getValue(0, 0);
				will(returnValue(7.5));
				one(mockedDependancy).getValue(0, 1);
				will(returnValue(2.5));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(mockedDependancy, 0);
		
		assertEquals(10.0, result, .000000001d);
	}
	
	/**
	 * Calculate row total for two positive values negative row value.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void calculateRowTotalForTwoPositiveValuesNegativeRowValue() {
		mockingContext.checking(new Expectations() {
			{
				one(mockedDependancy).getColumnCount();
				will(returnValue(2));
				one(mockedDependancy).getValue(-1, 0);
				// This seems redundant. Is there a correct way to mock this? What are we even
				// testing for at this point?
				// It seems like all we are testing is that the -1 gets passed to the .getValue
				// method properly
				will(throwException(new IndexOutOfBoundsException()));
				one(mockedDependancy).getValue(-1, 0);
				will(returnValue(2.5));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(mockedDependancy, -1);
		
		assertEquals(10.0, result, .000000001d);
	}
	
	/**
	 * Calculate row total for two high precision doubles.
	 */
	@Test
	public void calculateRowTotalForTwoHighPrecisionDoubles() {
		mockingContext.checking(new Expectations() {
			{
				one(mockedDependancy).getColumnCount();
				will(returnValue(2));
				one(mockedDependancy).getValue(0, 0);
				will(returnValue(2.000000001));
				one(mockedDependancy).getValue(0, 1);
				will(returnValue(2.000000001));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(mockedDependancy, 0);
		
		assertEquals(4.000000002, result, .000000001d);
	}
	
	/**
	 * Calculate row total for null values 2 D.
	 */
	@Test(expected = InvalidParameterException.class)
	public void calculateRowTotalForNullValues2D() {
		
		double result = DataUtilities.calculateRowTotal(null, 0);
	}
	
}
