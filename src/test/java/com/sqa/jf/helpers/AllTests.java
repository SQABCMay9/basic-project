/**
 *   File Name: AllTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 2, 2016
 *   
 */

package com.sqa.jf.helpers;

import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Suite.*;

/**
 * AllTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      LastName, FirstName
 * @version     1.0.0
 * @since       1.0
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ BasicDPTestTest2.class, JDataDrivenTest.class, JUnit3Test.class, JUnitDataDrivenTest.class,
		MultArrayTest.class })
public class AllTests {

}
