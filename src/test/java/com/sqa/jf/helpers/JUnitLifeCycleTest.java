/**
 *   File Name: JUnitLifeCycleTest.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 2, 2016
 *
 */

package com.sqa.jf.helpers;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

/**
 * JUnitLifeCycleTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
@RunWith(Parameterized.class)
public class JUnitLifeCycleTest {

	@Parameters
	public static Object[] getData() {
		return new Object[] { new Object[] { "Number 1" }, new Object[] { "Number 2" }, new Object[] { "Number 3" },
				new Object[] { "Number 4" }, new Object[] { "Number 5" }, new Object[] { "Number 6" } };
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass - Setup Before Class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass - Tear Down After Class");
	}

	private String testNumber;

	/**
	 * @param testNumber
	 */
	public JUnitLifeCycleTest(String testNumber) {
		this.testNumber = testNumber;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("\t@Before - Setup Before Test");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("\t@After - Tear Down After Test");
	}

	@Test
	public void test() {
		System.out.println("\t\t@Test - Test Run... " + this.testNumber);
	}

}
