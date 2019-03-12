package org.jfree.data.test;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
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
	
}
