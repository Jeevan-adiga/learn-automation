package com.learn.automation.listeners.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.learn.automation.TestBase;
import com.learn.automation.listeners.TestListner;

@Listeners(value={TestListner.class})
public class TestNG_TestListener_Example_Test extends TestBase {

	@Test
	void testCase() {
		
		System.out.println("Print From TestCase");
	}
}
