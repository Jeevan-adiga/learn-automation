package com.learn.automation.dp;

import org.testng.annotations.Test;

import com.learn.automation.TestBase;
import com.learn.automation.listeners.TestListner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(value = TestListner.class)
public class TestNg_Example_TestCase extends TestBase {

	
	@BeforeTest
	void testCase() {		
		System.out.println("From Testcase - testcase");
	}
	
	@Test
	void testCase1() {
		System.out.println("From Testcase - testcase");
	}
	
	@AfterMethod 
	void testCase2() {
		System.out.println("From Testcase - testcase");
	}

}
