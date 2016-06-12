/**
 *   File Name: MultArray.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 1, 2016
 *
 */

package com.sqa.jf.helpers;

/**
 * MultArray //ADDD (description of class)
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
public class MultArray {
	public static Object[][] getData() {
		Object[][] data = new Object[6][];
		data[0] = new Object[] { "Adding Example 1", 78, 23, 26, 20, 9 };
		data[1] = new Object[] { "Adding Example 2", 201, 45, 67, 89 };
		data[2] = new Object[] { "Adding Example 3", 162, 46, 87, 29 };
		data[3] = new Object[] { "Adding Example 4", 173, 29, 52, 60, 32 };
		data[4] = new Object[] { "Adding Example 5", 58, 22, 11, 25 };
		data[5] = new Object[] { "Adding Example 6", 158, 92, 11, 25, 30 };
		return data;
	}
}
