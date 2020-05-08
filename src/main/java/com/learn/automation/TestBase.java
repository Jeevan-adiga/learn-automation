package com.learn.automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.learn.automation.listeners.suite.SuiteListeners;

@Listeners(value = SuiteListeners.class)
public class TestBase {

	@BeforeMethod
	void setup() {
		
		System.out.println("Driver initialisation - method - setup");
	}
	
	@AfterClass
	void cleanUp() {
		
		System.out.println("Driver Close - class - cleanup");
	}
}
