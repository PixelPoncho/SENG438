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
	private double upper = -15;
	private double lower = -15;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		exampleRange = new Range(lower, upper);
	}

	@Test
	public void centralValue() {
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
		// double absUpper = Math.abs(upper);
		// double absLower = Math.abs(lower);
		double myCalcLength = upper - lower;
		assertEquals("The length value of " + lower + " and " + upper + " should be " + myCalcLength, myCalcLength,
				exampleRange.getUpperBound(), .000000001d);
	}

	@Test
	public void containsBLB() {
		// exampleRange = new Range(0,10);
		double BLB = lower - 1;
		assertFalse("range " + lower + " and " + upper + " should NOT contain " + BLB, exampleRange.contains(BLB));
	}

	@Test
	public void containsLB() {
		// exampleRange = new Range(0,10);
		double LB = lower;
		assertTrue("range " + lower + " and " + upper + " should contain " + LB, exampleRange.contains(LB));
	}

	@Test
	public void containsAUB() {
		// exampleRange = new Range(0,10);
		double AUB = upper + 1;
		assertFalse("range " + lower + " and " + upper + " should NOT contain " + AUB, exampleRange.contains(AUB));
	}

	@Test
	public void containsUB() {
		// exampleRange = new Range(0,10);
		double UB = upper;
		assertTrue("range " + lower + " and " + upper + " should contain " + UB, exampleRange.contains(UB));
	}

	@Test
	public void containsMyCentral() {
		// exampleRange = new Range(0,10);
		double centralValue = (upper + lower) / 2; // not using inbuilt cntralvalue because reasons
		assertTrue("range " + lower + " and " + upper + " should contain " + centralValue,
				exampleRange.contains(centralValue));
	}

	@Test
	public void constrainsMyCentral() {
		// exampleRange = new Range(0,10);
		double centralValue = (upper + lower) / 2; // not using inbuilt cntralvalue because reasons
		assertEquals("range " + lower + " and " + upper + " should constrain " + centralValue, centralValue,
				exampleRange.constrain(centralValue), .000000001d);
	}

	@Test
	public void constrainsBLB() {
		// exampleRange = new Range(0,10);
		double BLB = lower - 1;
		assertEquals("range " + lower + " and " + upper + " should constrain " + BLB + " to " + lower, lower,
				exampleRange.constrain(BLB), .000000001d);
	}
	@Test
	public void constrainsLB() {
		// exampleRange = new Range(0,10);
		double LB = lower;
		assertEquals("range " + lower + " and " + upper + " should constrain " + LB + " to " + lower, lower,
				exampleRange.constrain(LB), .000000001d);
	}
	
	@Test
	public void constrainsAUB() {
		// exampleRange = new Range(0,10);
		double AUB = upper + 1;
		assertEquals("range " + lower + " and " + upper + " should constrain " + AUB + " to " + upper, upper,
				exampleRange.constrain(AUB), .000000001d);
	}
	@Test
	public void constrainsUB() {
		// exampleRange = new Range(0,10);
		double UB = upper;
		assertEquals("range " + lower + " and " + upper + " should constrain " + UB + " to " + upper, upper,
				exampleRange.constrain(UB), .000000001d);
	}
	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
