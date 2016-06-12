package com.sqa.jf.helpers;

import org.testng.*;
import org.testng.annotations.*;

public class BasicDPTest {

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { { 0, 5, 15 }, { 1, 5, 6 }, { 100, 5, 105 } };
	}

	@Test(dataProvider = "dp")
	public final void testAdd(int input1, int input2, int expected) {
		int actual = Calculator.add(input1, input2);
		Assert.assertEquals(actual, expected, "actual not matching with expected");
	}
}
