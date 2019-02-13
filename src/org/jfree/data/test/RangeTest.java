/**
 *
 */
package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

/**
 * <pre>
 * 
 * The Class RangeTest.
 * 
 * To be able to test any given range, one MUST CHANGE the 2 class variables:
 * upper and lower. Some example ranges: 
 * (0,0) 
 * (-1,1) 
 * (1,-1)
 * (5,5) 
 * (-5,-5)
 * (100000000000000,100000000000000)
 *
 * &#64;author arebe
 * </pre>
 */

public class RangeTest {
	/*
	 * extends Range { } public RangeTest(double lower, double upper) { super(lower,
	 * upper); // TODO Auto-generated constructor stub }
	 */
	
	/** The example range. */
	private Range	exampleRange;
	
	/** The upper. */
	private double	upper	= 0;
	
	/** The lower. */
	private double	lower	= 0;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		exampleRange = new Range(lower, upper);
	}
	
	/**
	 * Central value.
	 */
	@Test
	public void centralValue() {
		double centralValue = (upper + lower) / 2;
		assertEquals("The central value of " + lower + " and " + upper + " should be " + centralValue, centralValue,
				exampleRange.getCentralValue(), .000000001d);
	}
	
	/**
	 * Gets the lower bound.
	 *
	 * @return the lower bound
	 */
	@Test
	public void getLowerBound() {
		// exampleRange = new Range(0,10);
		assertEquals("The lower bound of  " + lower + " and " + upper + " should be " + lower, lower,
				exampleRange.getLowerBound(), .000000001d);
	}
	
	/**
	 * Gets the upper bound.
	 *
	 * @return the upper bound
	 */
	@Test
	public void getUpperBound() {
		// exampleRange = new Range(0,10);
		assertEquals("The upper bound of " + lower + " and " + upper + " should be " + upper, upper,
				exampleRange.getUpperBound(), .000000001d);
	}
	
	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	@Test
	public void getLength() {
		// exampleRange = new Range(0,10);
		// double absUpper = Math.abs(upper);
		// double absLower = Math.abs(lower);
		double myCalcLength = upper - lower;
		assertEquals("The length value of " + lower + " and " + upper + " should be " + myCalcLength, myCalcLength,
				exampleRange.getUpperBound(), .000000001d);
	}
	
	/**
	 * Contains BLB.
	 */
	@Test
	public void containsBLB() {
		// exampleRange = new Range(0,10);
		double BLB = lower - 1;
		assertFalse("range " + lower + " and " + upper + " should NOT contain " + BLB, exampleRange.contains(BLB));
	}
	
	/**
	 * Contains LB.
	 */
	@Test
	public void containsLB() {
		// exampleRange = new Range(0,10);
		double LB = lower;
		assertTrue("range " + lower + " and " + upper + " should contain " + LB, exampleRange.contains(LB));
	}
	
	/**
	 * Contains AUB.
	 */
	@Test
	public void containsAUB() {
		// exampleRange = new Range(0,10);
		double AUB = upper + 1;
		assertFalse("range " + lower + " and " + upper + " should NOT contain " + AUB, exampleRange.contains(AUB));
	}
	
	/**
	 * Contains UB.
	 */
	@Test
	public void containsUB() {
		// exampleRange = new Range(0,10);
		double UB = upper;
		assertTrue("range " + lower + " and " + upper + " should contain " + UB, exampleRange.contains(UB));
	}
	
	/**
	 * Contains my central.
	 */
	@Test
	public void containsMyCentral() {
		// exampleRange = new Range(0,10);
		double centralValue = (upper + lower) / 2; // not using inbuilt cntralvalue because reasons
		assertTrue("range " + lower + " and " + upper + " should contain " + centralValue,
				exampleRange.contains(centralValue));
	}
	
	/**
	 * Constrains my central.
	 */
	@Test
	public void constrainsMyCentral() {
		// exampleRange = new Range(0,10);
		double centralValue = (upper + lower) / 2; // not using inbuilt cntralvalue because reasons
		assertEquals("range " + lower + " and " + upper + " should constrain " + centralValue, centralValue,
				exampleRange.constrain(centralValue), .000000001d);
	}
	
	/**
	 * Constrains BLB.
	 */
	@Test
	public void constrainsBLB() {
		// exampleRange = new Range(0,10);
		double BLB = lower - 1;
		assertEquals("range " + lower + " and " + upper + " should constrain " + BLB + " to " + lower, lower,
				exampleRange.constrain(BLB), .000000001d);
	}
	
	/**
	 * Constrains LB.
	 */
	@Test
	public void constrainsLB() {
		// exampleRange = new Range(0,10);
		double LB = lower;
		assertEquals("range " + lower + " and " + upper + " should constrain " + LB + " to " + lower, lower,
				exampleRange.constrain(LB), .000000001d);
	}
	
	/**
	 * Constrains AUB.
	 */
	@Test
	public void constrainsAUB() {
		// exampleRange = new Range(0,10);
		double AUB = upper + 1;
		assertEquals("range " + lower + " and " + upper + " should constrain " + AUB + " to " + upper, upper,
				exampleRange.constrain(AUB), .000000001d);
	}
	
	/**
	 * Constrains UB.
	 */
	@Test
	public void constrainsUB() {
		// exampleRange = new Range(0,10);
		double UB = upper;
		assertEquals("range " + lower + " and " + upper + " should constrain " + UB + " to " + upper, upper,
				exampleRange.constrain(UB), .000000001d);
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
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
}
