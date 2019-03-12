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
	
	/**
	 * Intersects test.
	 */
	@Test
	public void intersectsTest() {
		
	}
	
	/**
	 * Combine test.
	 */
	@Test
	public void combineTest() {
		
	}
	
	/**
	 * Expand to include test.
	 */
	@Test
	public void expandToIncludeTest() {
		
	}
	
	/**
	 * Shift 2 inputs test.
	 */
	@Test
	public void shift2InputsTest() {
		
	}
	
	/**
	 * Shift 3 inputs test.
	 */
	@Test
	public void shift3InputsTest() {
		
	}
	
	/**
	 * Shift with no zero crossing test.
	 */
	@Test
	public void shiftWithNoZeroCrossingTest() {
		
	}
	
	/**
	 * Equals test.
	 */
	@Test
	public void equalsTest() {
		
	}
	
	/**
	 * Hash code test.
	 */
	@Test
	public void hashCodeTest() {
		
	}
	
	/**
	 * To string test.
	 */
	@Test
	public void toStringTest() {
		// return ("Range[" + this.lower + "," + this.upper + "]");
	}
	
}
