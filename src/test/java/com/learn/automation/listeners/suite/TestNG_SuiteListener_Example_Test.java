package com.learn.automation.listeners.suite;

import org.testng.annotations.Test;

import com.learn.automation.TestBase;

public class TestNG_SuiteListener_Example_Test extends TestBase {

	@Test
	void testCase() {
		
		System.out.println("Print From TestCase");
	}
}
