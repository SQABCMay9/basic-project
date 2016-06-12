package com.sqa.jf.helpers;

import java.util.*;

import org.testng.*;
import org.testng.annotations.*;

public class MultArrayDataTest {

	@Test(dataProviderClass = MyDataProviders.class, dataProvider = "getData")
	public void multArrayTest(String title, int expectedResult, int... nums) {
		System.out.println(title);
		System.out.println("--------------------------------");
		System.out.println("Adding:" + Arrays.toString(nums) + " = " + expectedResult + "?");
		int actualResult = addNumbers(nums);
		Assert.assertEquals(expectedResult, actualResult);
		System.out.println("Passed the test!");
		System.out.println("--------------------------------");
		System.out.println();
	}

	@Test(dataProviderClass = MyDataProviders.class, dataProvider = "getData2")
	public void multArrayTest2(String title, int expectedResult, int... nums) {
		System.out.println(title);
		System.out.println("--------------------------------");
		System.out.println("Adding:" + Arrays.toString(nums) + " = " + expectedResult + "?");
		int actualResult = addNumbers(nums);
		Assert.assertEquals(expectedResult, actualResult);
		System.out.println("Passed the test!");
		System.out.println("--------------------------------");
		System.out.println();
	}

	private int addNumbers(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		return result;
	}
}
