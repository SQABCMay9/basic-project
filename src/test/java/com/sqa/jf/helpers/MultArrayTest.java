/**
 *   File Name: MultArrayTest.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 1, 2016
 *
 */

package com.sqa.jf.helpers;

import org.junit.*;

/**
 * MultArrayTest //ADDD (description of class)
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
public class MultArrayTest {

	@Test
	public void test() {
		// Get Data for test
		Object[][] data = MultArray.getData();
		// Use Helper Method to Display Data
		DisplayHelper.multArray(data);
	}

}
