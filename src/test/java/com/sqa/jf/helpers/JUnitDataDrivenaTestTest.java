package com.sqa.jf.helpers;

import org.testng.annotations.*;

public class JUnitDataDrivenaTestTest {
	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a", "jean" }, new Object[] { 2, "b", "jf" }, };
	}

	@Test(dataProvider = "dp")
	public void f(Integer n, String s, String name) {

	}
}
