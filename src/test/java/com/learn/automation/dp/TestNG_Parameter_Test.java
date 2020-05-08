package com.learn.automation.dp;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter_Test {

		
	@Test
	@Parameters(value = {"browser"})
	public void testCase(@Optional("chrome") String browser) {
		System.out.println("browser:" + browser);	
	}
	
	@Test
	@Parameters(value = {"browser"})
	public void testCase1(String browser) {
		System.out.println("browser:" + browser);	
	}
}
