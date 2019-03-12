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
	 * Intersects test.
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
		assertTrue("(0,0) and (-1,5) should intersect", intersects);
		
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
	 * Combine test.
	 */
	@Test
	public void combineTest() {
		
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	/**
	 * Expand to include test.
	 */
	@Test
	public void expandToIncludeTest() {
		
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	/**
	 * Shift 2 inputs test.
	 */
	@Test
	public void shift2InputsTest() {
		
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	/**
	 * Shift 3 inputs test.
	 */
	@Test
	public void shift3InputsTest() {
		
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	/**
	 * Shift with no zero crossing test.
	 */
	@Test
	public void shiftWithNoZeroCrossingTest() {
		
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	/**
	 * Equals test.
	 */
	@Test
	public void equalsTest() {
		
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	/**
	 * Hash code test.
	 */
	@Test
	public void hashCodeTest() {
		
	}
	
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
	/**
	 * To string test.
	 */
	@Test
	public void toStringTest() {
		// return ("Range[" + this.lower + "," + this.upper + "]");
	}
	//////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////
}
