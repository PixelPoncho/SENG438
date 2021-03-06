package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.*;

// TODO: Auto-generated Javadoc
/**
 * The Class RangeTest_2_OtherFuncs.
 *
 * @author arebe
 */
public class RangeTest_2_OtherFuncs {
	/*
	 * extends Range { } public RangeTest(double lower, double upper) { super(lower,
	 * upper); // TODO Auto-generated constructor stub }
	 */
	
	/**
	 * The example range.
	 *
	 * @throws Exception the exception
	 */
	// private Range exampleRange;
	
	/** The upper. */
	// private double upper = Double.MAX_VALUE;
	
	/** The lower. */
	// private double lower = -Double.MAX_VALUE;
	
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
		// exampleRange = new Range(lower, upper);
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
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Intersects same test.
	 */
	@Test
	public void intersects_same_Test() {
		// 152 true
		// 153 true
		Range myRange = new Range(0, 10);
		boolean intersects = myRange.intersects(0, 10);
		assertFalse("(0,10) and (0,10) should NOT intersect", intersects);
		
	}
	
	/**
	 * Intersects zero test.
	 */
	@Test
	public void intersects_zero_Test() {
		// 152 true
		// 153 false
		Range myRange = new Range(0, 0);
		boolean intersects = myRange.intersects(0, 0);
		assertFalse("(0,0) and (0,0) should NOT intersect", intersects);
		
	}
	
	/**
	 * Intersects smaller lower test.
	 */
	@Test
	public void intersects_smallerLower_Test() {
		// 152 true
		// 153 true
		Range myRange = new Range(0, 5);
		boolean intersects = myRange.intersects(-1, 2);
		assertTrue("(0,5) and (-1,2) should intersect - overlap across bottom", intersects);
		
	}
	
	/**
	 * Intersects specified is contained test.
	 */
	@Test
	public void intersects_specifiedIsContained_Test() {
		// 152 false
		// 156 A true
		// 156 B true
		Range myRange = new Range(-5, 5);
		boolean intersects = myRange.intersects(0, 2);
		assertFalse("(-5,5) and (0,2) should NOT intersect", intersects);
		
	}
	
	/**
	 * Intersects range is contained test.
	 */
	@Test
	public void intersects_rangeIsContained_Test() {
		// 152 true
		// 153 true
		Range myRange = new Range(-5, 5);
		boolean intersects = myRange.intersects(-10, 10);
		assertFalse("(-5,5) and (-10,10) should NOT intersect", intersects);
		
	}
	
	/**
	 * Intersects invalid reverse range test.
	 */
	@Test
	public void intersects_invalidReverseRange_Test() {
		// 152 false
		// 156 A true
		// 156 B false
		Range myRange = new Range(-5, 5);
		boolean intersects = myRange.intersects(10, 0);
		assertFalse("(-5,5) and (10,0) should NOT intersect(invalid 2nd range)", intersects);
		
	}
	
	/**
	 * Intersects invalid reverse range F F test.
	 */
	@Test
	public void intersects_invalidReverseRange_FF_Test() {
		// 152 false
		// 156 A false
		// 156 B false
		Range myRange = new Range(-5, 5);
		boolean intersects = myRange.intersects(0, -2);
		assertFalse("(-5,5) and (0,-2) should NOT intersect(invalid 2nd range)", intersects);
		
	}
	
	/**
	 * Intersects larger both test.
	 */
	@Test
	public void intersects_largerBoth_Test() {
		// 152 false
		// 156 A false
		// 156 B true
		Range myRange = new Range(-5, 5);
		boolean intersects = myRange.intersects(0, 20);
		assertTrue("(-5,5) and (0,20) should intersect", intersects);
		
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Constrain containts test.
	 */
	@Test
	public void constrain_containts_Test() {
		// 171 false
		Range myRange = new Range(-5, 5);
		double constrains = myRange.constrain(0);
		// assertEquals(message, expected, actual);
		assertEquals("(-5,5) should constrain 0 to 0", 0, constrains, .000000001d);
	}
	
	/**
	 * constrain larger than upper test.
	 */
	@Test
	public void constrain_largerThanUpper_Test() {
		// 171 true
		// 172 true
		Range myRange = new Range(-5, 5);
		double constrains = myRange.constrain(10);
		// assertEquals(message, expected, actual);
		assertEquals("(-5,5) should constrain 10 to 5", 5, constrains, .000000001d);
	}
	
	/**
	 * constrain smaller than lower test.
	 */
	@Test
	public void constrain_smallerThanLower_Test() {
		// 171 true
		// 172 false
		// 175 true
		Range myRange = new Range(-5, 5);
		double constrains = myRange.constrain(-10);
		// assertEquals(message, expected, actual);
		assertEquals("(-5,5) should constrain -10 to -5", -5, constrains, .000000001d);
	}
	
	/**
	 * constrain lower bound test. TODO: NO WAY TO GET LAST DECISION PATH!!!
	 */
	@Test
	public void constrain_lowerBound_Test() {
		// 171 true??
		// 172 false
		// 175 hopefully False
		Range myRange = new Range(-5, 5);
		double constrains = myRange.constrain(-5);
		// assertEquals(message, expected, actual);
		assertEquals("(-5,5) should constrain -5 to -5", -5, constrains, .000000001d);
	}
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/*
	 * TODO: note that CANNOT test combine without using getLowerBound or
	 * getUpperBound. Sorry, I don't wanna learn reflection right now.
	 */
	
	/**
	 * Combine first null test.
	 */
	@Test
	public void combine_firstNull_Test() {
		// 199 true
		Range range1 = null;
		Range range2 = new Range(-5, 5);
		Range result = Range.combine(range1, range2);
		assertEquals("null and (-5,5) should combine to (-5,5). Lower bound should be -5.", -5, result.getLowerBound(),
				.000000001d);
		assertEquals("null and (-5,5) should combine to (-5,5). Upper bound should be 5.", 5, result.getUpperBound(),
				.000000001d);
		
	}
	
	/**
	 * Combine second null test.
	 */
	@Test
	public void combine_secondNull_Test() {
		// 199 false
		// 203 true
		Range range1 = new Range(-5, 5);
		Range range2 = null;
		Range result = Range.combine(range1, range2);
		assertEquals("(-5,5) and null should combine to (-5,5). Lower bound should be -5.", -5, result.getLowerBound(),
				.000000001d);
		assertEquals("(-5,5) and null should combine to (-5,5). Upper bound should be 5.", 5, result.getUpperBound(),
				.000000001d);
		
	}
	
	/**
	 * Combine both not null test.
	 */
	@Test
	public void combine_bothNotNull_Test() {
		// 199 false
		// 203 false
		Range range1 = new Range(-5, 5);
		Range range2 = new Range(10, 20);
		Range result = Range.combine(range1, range2);
		assertEquals("(-5,5) and (10, 20) should combine to (-5,20). Lower bound should be -5.", -5,
				result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) and (10, 20) should combine to (-5,20). Upper bound should be 20.", 20,
				result.getUpperBound(), .000000001d);
		
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Expand to include range null test.
	 */
	@Test
	public void expandToInclude_rangeNull_Test() {
		// 226 true
		Range range = null;
		double value = 10;
		Range result = Range.expandToInclude(range, value);
		assertEquals("null expanding to include 10 should return (10,10). Lower bound should be 10.", 10,
				result.getLowerBound(), .000000001d);
		assertEquals("null expanding to include 10 should return (10,10). Upper bound should be 10.", 10,
				result.getUpperBound(), .000000001d);
	}
	
	/**
	 * Expand to include smaller lower test.
	 */
	@Test
	public void expandToInclude_smallerLower_Test() {
		// 226 false
		// 229 true
		Range range = new Range(-5, 5);
		double value = -10;
		Range result = Range.expandToInclude(range, value);
		assertEquals("(-5,5) expanding to include -10 should return (-10,5). Lower bound should be -10.", -10,
				result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) expanding to include -10 should return (-10,5). Upper bound should be 5.", 5,
				result.getUpperBound(), .000000001d);
	}
	
	/**
	 * Expand to include bigger upper test.
	 */
	@Test
	public void expandToInclude_biggerUpper_Test() {
		// 226 false
		// 229 false
		// 232 true
		Range range = new Range(-5, 5);
		double value = 10;
		Range result = Range.expandToInclude(range, value);
		assertEquals("(-5,5) expanding to include 10 should return (-5,10). Lower bound should be -5.", -5,
				result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) expanding to include 10 should return (-5,10). Upper bound should be 10.", 10,
				result.getUpperBound(), .000000001d);
	}
	
	/**
	 * Expand to include contained test.
	 */
	@Test
	public void expandToInclude_contained_Test() {
		// 226 false
		// 229 false
		// 232 false
		Range range = new Range(-5, 5);
		double value = 0;
		Range result = Range.expandToInclude(range, value);
		assertEquals("(-5,5) expanding to include 0 should return (-5,5). Lower bound should be -5.", -5,
				result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) expanding to include 0 should return (-5,5). Upper bound should be 5.", 5,
				result.getUpperBound(), .000000001d);
	}
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Expand null range test.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void expand_nullRange_Test() {
		// 254 true
		Range range = null;
		double lowerMargin = 0;
		double upperMargin = 0;
		Range result = Range.expand(range, lowerMargin, upperMargin); // should throw exception
		/*
		 * assertEquals("(-5,5) expanding to include 0 should return (-5,5). Lower bound should be -5."
		 * , -5, result.getLowerBound(), .000000001d);
		 * assertEquals("(-5,5) expanding to include 0 should return (-5,5). Upper bound should be 5."
		 * , 5, result.getUpperBound(), .000000001d);
		 */
	}
	
	/**
	 * Expand good test.
	 */
	@Test
	public void expand_Good_Test() {
		// 254 false
		// For example: expand(new Range(2, 6), 0.25, 0.5) returns a range from 1 to 8.
		Range range = new Range(2, 6);
		double lowerMargin = 0.25;
		double upperMargin = 0.5;
		Range result = Range.expand(range, lowerMargin, upperMargin);
		assertEquals("expand(new Range(2, 6), 0.25, 0.5) returns a range from 1 to 8. Lower bound should be 1.", 1,
				result.getLowerBound(), .000000001d);
		assertEquals("expand(new Range(2, 6), 0.25, 0.5) returns a range from 1 to 8. Upper bound should be 8.", 8,
				result.getUpperBound(), .000000001d);
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Shift 2 inputs not allow crossing test.
	 */
	@Test
	public void shift_2Inputs_notAllowCrossing_Test() {
		Range base = new Range(-5, 5);
		double delta = 1;
		Range result = Range.shift(base, delta);
		assertEquals("(-5,5) shifted by 1 should return (-4,6). Lower bound should be -4.", -4, result.getLowerBound(),
				.000000001d);
		assertEquals("(-5,5) shifted by 1 should return (-4,6). Upper bound should be 6.", 6, result.getUpperBound(),
				.000000001d);
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Shift 3 inputs allow crossing test.
	 */
	@Test
	public void shift_3Inputs_allowCrossing_Test() {
		Range base = new Range(-5, 5);
		double delta = 10;
		Range result = Range.shift(base, delta, true);
		assertEquals("(-5,5) shifted by 10 and zero crossing should return (5,15). Lower bound should be 5.", 5,
				result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) shifted by 10 and zero crossing should return (5,15). Upper bound should be 15.", 15,
				result.getUpperBound(), .000000001d);
	}
	
	/**
	 * Shift 3 inputs allow crossing negative test.
	 */
	@Test
	public void shift_3Inputs_allowCrossing_negative_Test() {
		Range base = new Range(-5, 5);
		double delta = -10;
		Range result = Range.shift(base, delta, true);
		assertEquals("(-5,5) shifted by -10 and zero crossing should return (-15,-5). Lower bound should be -15.", -15,
				result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) shifted by -10 and zero crossing should return (-15,-5). Upper bound should be -5.", -5,
				result.getUpperBound(), .000000001d);
	}
	
	/**
	 * Shift 3 inputs not allow crossing neg to pos test.
	 */
	@Test
	public void shift_3Inputs_notAllowCrossing_negToPos_Test() {
		Range base = new Range(-5, 5);
		double delta = 10;
		Range result = Range.shift(base, delta, false);
		assertEquals("(-5,5) shifted by 10 and NO zero crossing should return (0,15). Lower bound should be 0.", 0,
				result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) shifted by 10 and NO zero crossing should return (0,15). Upper bound should be 15.", 15,
				result.getUpperBound(), .000000001d);
	}
	
	/**
	 * Shift 3 inputs not allow crossing pos to neg test.
	 */
	@Test
	public void shift_3Inputs_notAllowCrossing_posToNeg_Test() {
		Range base = new Range(-5, 5);
		double delta = -10;
		Range result = Range.shift(base, delta, false);
		assertEquals("(-5,5) shifted by -10 and NO zero crossing should return (-15,0). Lower bound should be -15.",
				-15, result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) shifted by -10 and NO zero crossing should return (-15,0). Upper bound should be 0.", 0,
				result.getUpperBound(), .000000001d);
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Shift with no zero crossing zero test.
	 */
	@Test
	public void shiftWithNoZeroCrossing_zero_Test() {
		Range base = new Range(-5, 5);
		double delta = 0.0;
		Range result = Range.shift(base, delta, false);
		assertEquals("(-5,5) shifted by 0 and NO zero crossing should return (-5,5). Lower bound should be -5.", -5,
				result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) shifted by 0 and NO zero crossing should return (-5,5). Upper bound should be 5.", 5,
				result.getUpperBound(), .000000001d);
	}
	
	/**
	 * Shift with no zero crossing range has zero test.
	 */
	@Test
	public void shiftWithNoZeroCrossing_rangeHasZero_Test() {
		Range base = new Range(0, 5);
		double delta = 5;
		Range result = Range.shift(base, delta, false);
		assertEquals("(-5,5) shifted by 5 and NO zero crossing should return (5,10). Lower bound should be 5.", 5,
				result.getLowerBound(), .000000001d);
		assertEquals("(-5,5) shifted by 5 and NO zero crossing should return (5,10). Upper bound should be 10.", 10,
				result.getUpperBound(), .000000001d);
	}
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Equals non range test.
	 */
	@Test
	public void equals_nonRange_Test() {
		// 334 true
		Range range1 = new Range(-5, 5);
		Object range2 = new Object();
		boolean result = range1.equals(range2);
		assertFalse("comparing a non-range Object to range should return false", result);
	}
	
	/**
	 * Equals lower unequal test.
	 */
	@Test
	public void equals_lowerUnequal_Test() {
		// 334 false
		// 338 true
		Range range1 = new Range(-5, 5);
		Range range2 = new Range(0, 5);
		boolean result = range1.equals(range2);
		assertFalse("compare (-5,5) to (0,5), lower bound of range 2 not equal. should return false", result);
	}
	
	/**
	 * Equals upper unequal test.
	 */
	@Test
	public void equals_upperUnequal_Test() {
		// 334 false
		// 338 true
		Range range1 = new Range(-5, 5);
		Range range2 = new Range(-5, 0);
		boolean result = range1.equals(range2);
		assertFalse("compare (-5,5) to (-5,0), upper bound of range 2 not equal. should return false", result);
	}
	
	/**
	 * Equals equivalent test.
	 */
	@Test
	public void equals_equivalent_Test() {
		// 334 false
		// 338 true
		Range range1 = new Range(-5, 5);
		Range range2 = new Range(-5, 5);
		boolean result = range1.equals(range2);
		assertTrue("compare (-5,5) to (-5,5), bounds same. should return true", result);
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Hash code test.
	 */
	
	@Test
	public void hashCode_Test() {
		Range range = new Range(-5, 5);
		int hashCode = range.hashCode();
		assertNotNull("hashcode should be something... it is null.", hashCode);
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * To string test.
	 */
	@Test
	public void toString_Test() {
		// "Range[lower,upper]"
		// return ("Range[" + this.lower + "," + this.upper + "]");
		// String.equals(); ???
		Range range = new Range(-5, 5);
		String myString = "Range[-5,5]";
		String rangeString = range.toString();
		// assertEquals("(-5,5) shifted by 5 and NO zero crossing should return (5,10).
		// Lower bound should be 5.",
		// myString, rangeString, .000000001d);
		// TODO: CANNOT HAVE MESSAGE WITH STRING COMPARAISON!!!
		assertEquals(myString, rangeString);
		
	}
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
}
