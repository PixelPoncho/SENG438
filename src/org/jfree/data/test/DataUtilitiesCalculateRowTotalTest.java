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

public class DataUtilitiesCalculateRowTotalTest extends DataUtilities {
	private Mockery mockingContext;
	Values2D mockedDependancy;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mockingContext = new Mockery();
		mockedDependancy = mockingContext.mock(Values2D.class);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//I have no idea what is supposed to happen, but it appears to treat the null as a 1
	//This case is not covered by the requirements... are we supposed to do it still?
	@Test
	public void calculateRowTotalOneNullValue() {
		mockingContext.checking( new Expectations() {
			{
				one(mockedDependancy).getColumnCount();
				will(returnValue(2));
				one(mockedDependancy).getValue(0, 0);
				will(returnValue(null));
				one(mockedDependancy).getValue(0,  1);
				will(returnValue(5));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(mockedDependancy, 0);
		
		//What am I supposed to assert? There is no defined behaviour for this case
		//ERROR: This works when expecting 6 for some reason?
		assertEquals(5, result, 000000001d);
	}

	@Test
	public void calculateRowTotalWithPosAndNegDataValuesHighPostiveRowValue() {
		mockingContext.checking( new Expectations() {
			{
				one(mockedDependancy).getColumnCount();
				will(returnValue(2));
				one(mockedDependancy).getValue(1000000, 0);
				will(returnValue(-3.5));
				one(mockedDependancy).getValue(1000000,  1);
				will(returnValue(2.5));
			}
		});
		
		double result = DataUtilities.calculateRowTotal(mockedDependancy, 1000000);
		
		assertEquals(-1.0, result, 000000001d);
	}
	
	@Test
	public void calculateRowTotalForTwoPositiveValuesZeroRowValue() {
		mockingContext.checking(
				new Expectations() {{
					one(mockedDependancy).getColumnCount(); 
					will(returnValue(2)); 
					one(mockedDependancy).getValue(0, 0); 
					will(returnValue(7.5)); 
					one(mockedDependancy).getValue(0, 1);
					will(returnValue(2.5));
				}}
			);
	
		double result = DataUtilities.calculateRowTotal(mockedDependancy, 0);
	
		assertEquals(10.0, result, .000000001d); 
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void calculateRowTotalForTwoPositiveValuesNegativeRowValue() {
		mockingContext.checking(
				new Expectations() {{
					one(mockedDependancy).getColumnCount(); 
					will(returnValue(2)); 
					one(mockedDependancy).getValue(-1, 0); 
				//This seems redundant. Is there a correct way to mock this? What are we even testing for at this point?
				//It seems like all we are testing is that the -1 gets passed to the .getValue method properly
					will(throwException(new IndexOutOfBoundsException())); 
					one(mockedDependancy).getValue(-1, 0);
					will(returnValue(2.5));
				}}
			);
	
		double result = DataUtilities.calculateRowTotal(mockedDependancy, -1);
	
		assertEquals(10.0, result, .000000001d); 
	}
	
	@Test
	public void calculateRowTotalForTwoHighPrecisionDoubles() {
		mockingContext.checking(
				new Expectations() {{
					one(mockedDependancy).getColumnCount(); 
					will(returnValue(2)); 
					one(mockedDependancy).getValue(0, 0); 
					will(returnValue(2.000000001)); 
					one(mockedDependancy).getValue(0, 1);
					will(returnValue(2.000000001));
				}}
			);
	
		double result = DataUtilities.calculateRowTotal(mockedDependancy, 0);
	
		assertEquals(4.000000002, result, .000000001d); 
	}
	
	@Test (expected = InvalidParameterException.class)
	public void calculateRowTotalForNullValues2D() {
	
		double result = DataUtilities.calculateRowTotal(null, 0);
	}


}
