/**
 * 
 */
package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

/**
 * @author arebe
 *
 */
public class RangeTest {
	/*
	 * extends Range { } public RangeTest(double lower, double upper) { super(lower,
	 * upper); // TODO Auto-generated constructor stub }
	 */

	private Range exampleRange;
	private double upper = 1;
	private double lower = -1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		exampleRange = new Range(lower, upper);
	}

	@Test
	public void centralValueShouldBeZero() {
		double centralValue = (upper + lower) / 2;
		assertEquals("The central value of " + lower + " and " + upper + " should be " + centralValue, centralValue,
				exampleRange.getCentralValue(), .000000001d);
	}

	@Test
	public void getLowerBound() {
		// exampleRange = new Range(0,10);
		assertEquals("The lower bound of  " + lower + " and " + upper + " should be " + lower, lower,
				exampleRange.getLowerBound(), .000000001d);
	}

	@Test
	public void getUpperBound() {
		// exampleRange = new Range(0,10);
		assertEquals("The upper bound of " + lower + " and " + upper + " should be " + upper, upper,
				exampleRange.getUpperBound(), .000000001d);
	}

	@Test
	public void getLength() {
		// exampleRange = new Range(0,10);
		double absUpper = Math.abs(upper);
		double absLower = Math.abs(lower);
		double myCalcLength = absUpper + absLower;
		assertEquals("The length value of " + lower + " and " + upper + " should be " + myCalcLength, myCalcLength,
				exampleRange.getUpperBound(), .000000001d);
	}

	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
