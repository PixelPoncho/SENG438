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
 * upper and lower. Equivalence classes on input are -Double.MAX_VALUE, negative value, 0, positive value, DOUBLE.MAX_VALUE, and null.
 * Since we are dealing with a range, we have additional equivalence classes of lengths 0, infinite, DOUBLE.MAX_VALUE, positive, and negative. By weak ECT, classes are:
 * (0,0)
 * (-1,1) 
 * (1,-1)
 * (-Double,MAX_VALUE, 0) 
 * (- Double.MAX_VALUE, Double.MAX_VALUE)
 * (NULL, NULL)
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
	private double	upper	= Double.MAX_VALUE;
	
	/** The lower. */
	private double	lower	= -Double.MAX_VALUE;
	
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
	public void centralValueTest() {
		double centralValue = (upper + lower) / 2;
		assertEquals("Getting central value", centralValue,
				exampleRange.getCentralValue(), .000000001d);
	}
	
	/**
	 * Gets the lower bound.
	 *
	 * @return the lower bound
	 */
	@Test
	public void getLowerBoundTest() {
		// exampleRange = new Range(0,10);
		assertEquals("Getting lower bound", lower,
				exampleRange.getLowerBound(), .000000001d);
	}
	
	/**
	 * Gets the upper bound.
	 *
	 * @return the upper bound
	 */
	@Test
	public void getUpperBoundTest() {
		// exampleRange = new Range(0,10);
		assertEquals("Getting upper bound", upper,
				exampleRange.getUpperBound(), .000000001d);
	}
	
	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	@Test
	public void getLengthTest() {
		// exampleRange = new Range(0,10);
		// double absUpper = Math.abs(upper);
		// double absLower = Math.abs(lower);
		double myCalcLength = upper - lower;
		assertEquals("Getting length", myCalcLength,
				exampleRange.getLength(), .000000001d);
	}
	
	/**
	 * Contains BLB.
	 */
	@Test
	public void containsBLB() {
		// exampleRange = new Range(0,10);
		double BLB = lower - 1;
		assertFalse("Contains() on lower - 1", exampleRange.contains(BLB));
	}
	
	/**
	 * Contains LB.
	 */
	@Test
	public void containsLB() {
		// exampleRange = new Range(0,10);
		double LB = lower;
		assertTrue("Contains() on lower", exampleRange.contains(LB));
	}
	
	/**
	 * Contains AUB.
	 */
	@Test
	public void containsAUB() {
		// exampleRange = new Range(0,10);
		double AUB = upper + 1;
		assertFalse("Contains on upper + 1", exampleRange.contains(AUB));
	}
	
	/**
	 * Contains UB.
	 */
	@Test
	public void containsUB() {
		// exampleRange = new Range(0,10);
		double UB = upper;
		assertTrue("Contains on upper", exampleRange.contains(UB));
	}
	
	/**
	 * Contains my central.
	 */
	@Test
	public void containsCentral() {
		// exampleRange = new Range(0,10);
		double centralValue = (upper + lower) / 2; 
		assertTrue("Contains() on central value",
				exampleRange.contains(centralValue));
	}
	
	/**
	 * Constrains my central.
	 */
	@Test
	public void constrainsCentral() {
		// exampleRange = new Range(0,10);
		double centralValue = (upper + lower) / 2; // not using inbuilt cntralvalue because reasons
		assertEquals("Constrains() on central value", centralValue,
				exampleRange.constrain(centralValue), .000000001d);
	}
	
	/**
	 * Constrains BLB.
	 */
	@Test
	public void constrainsBLB() {
		// exampleRange = new Range(0,10);
		double BLB = lower - 1;
		assertEquals("Constrains() on lower - 1", lower,
				exampleRange.constrain(BLB), .000000001d);
	}
	
	/**
	 * Constrains LB.
	 */
	@Test
	public void constrainsLB() {
		// exampleRange = new Range(0,10);
		double LB = lower;
		assertEquals("Constrains on lower", lower,
				exampleRange.constrain(LB), .000000001d);
	}
	
	/**
	 * Constrains AUB.
	 */
	@Test
	public void constrainsAUB() {
		// exampleRange = new Range(0,10);
		double AUB = upper + 1;
		assertEquals("Constrains() on upper + 1", upper,
				exampleRange.constrain(AUB), .000000001d);
	}
	
	/**
	 * Constrains UB.
	 */
	@Test
	public void constrainsUB() {
		// exampleRange = new Range(0,10);
		double UB = upper;
		assertEquals("Constrains on upper", upper,
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
	
	/*
	 * Creates Range with lower bound larger than upper
	 * */
	@Test(expected=IllegalArgumentException.class)
	public void rangeWithLowerGreaterThanUpper() {
		double lower = 10;
		double upper = 0;
		Range illigalRange = new Range(lower, upper);
		
	}
	
}
