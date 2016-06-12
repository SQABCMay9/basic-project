/**
 *   File Name: MyDataProviders.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 2, 2016
 *
 */

package com.sqa.jf.helpers;

import org.testng.annotations.*;

/**
 * MyDataProviders //ADDD (description of class)
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
public class MyDataProviders {

	@DataProvider
	public static Object[][] getData() {
		return MultArray.getData();
	}

	@DataProvider
	public static Object[][] getData2() {
		return MultArray.getData();
	}
}
