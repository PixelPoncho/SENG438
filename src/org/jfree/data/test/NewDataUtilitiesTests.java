package org.jfree.data.test;

import static org.junit.Assert.assertEquals;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;

public class NewDataUtilitiesTests {
	/*NEW TESTS*/
	
	/*
	 * Sends null in as argument when creating Number Array
	 * */
	@Test(expected=InvalidParameterException.class)
	public void createNumberArrayWithNull() {
		DataUtilities.createNumberArray(null);
	}
	
	/*
	 * Sends null in as argument when creating 2D Number Array
	 * */
	@Test(expected=InvalidParameterException.class)
	public void create2DNumberArrayWithNull() {
		DataUtilities.createNumberArray2D(null);
	}
	
	/*
	 * Sends null in as argument when getting cumulative percentages
	 * */
	@Test(expected=InvalidParameterException.class)
	public void getCumulativePercentagesWithNull() {
		DataUtilities.getCumulativePercentages(null);
	}
	
	/*
	 * Test calculateColumnTotal when there are 0 rows
	 * */
	@Test
	public void calculateColumnTotalZeroRows() {
		Mockery mockingContext = new Mockery();
		Values2D mockedDependancy = mockingContext.mock(Values2D.class);
		mockingContext.checking(new Expectations() {
			{
				one(mockedDependancy).getRowCount();
				will(returnValue(0));

			}
		});
		
		double result = DataUtilities.calculateColumnTotal(mockedDependancy, 0);

		assertEquals("testing CalculateColumnTotal with 0 rows", 0, result, .000000001d);
	}
}
