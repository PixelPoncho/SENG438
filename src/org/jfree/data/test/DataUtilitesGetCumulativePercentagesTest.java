package org.jfree.data.test;

import static org.junit.Assert.*;

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

public class DataUtilitesGetCumulativePercentagesTest extends DataUtilities {
	private Mockery mockingContext;
	KeyedValues mockedDependancy;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mockingContext = new Mockery();
		mockedDependancy = mockingContext.mock(KeyedValues.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getCumulativePercentageTestEmptyList() {
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
	
	@Test
	public void getCumulativePercentageTestNegativeValues() {
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
	
	@Test
	public void getCumulativePercentageTestNullValues() {
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
