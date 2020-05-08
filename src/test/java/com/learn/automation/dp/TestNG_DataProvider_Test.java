package com.learn.automation.dp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.learn.automation.pojo.Person;
import com.learn.automation.utils.DataProviderUtils;

public class TestNG_DataProvider_Test {

	
	// ------------------- data provider example 1 ---------------------- //
	@DataProvider(name="provideData")
	public Object[][] provideData() {
		
		Object[][] data = new Object[2][2]; // number of iteration : number of params
		data[0][0] = "zero:zero";
		data[0][1] = "zero:one";
		
		data[1][0] = "one:zero";
		data[1][1] = "one:one";
		
		return data;
	}
	
	@Test(dataProvider = "provideData")
	public void testCase(String paramOne, String paramTwo) {
		System.out.println("paramOne:paramTwo" + paramOne + " --- " + paramOne);	
	}
	
	// ------------------- data provider example 2 -------------------- //
	@DataProvider(name="provideDataExample")
	public Object[][] provideDataExample() {
		
		Object[][] data = new Object[5][1]; // number of iteration : number of params
		data[0][0] = new Person("Jack", "Sparrow");
		data[1][0] = new Person("Penny", "");
		data[2][0] = new Person("Chandler", "Bing");
		data[3][0] = new Person("Don", "Draper");
		data[4][0] = new Person("Sheldon", "Cooper");
		return data;
	}
	
	@Test(dataProvider = "provideDataExample")
	public void testCase2(Person paramOne) {
		System.out.println("Input" + paramOne.toString());
	}
	
	// ------------------- data provider example 3 - from class --------------------- //	
	@Test(dataProvider = "provideDataFromClass", dataProviderClass = DataProviderUtils.class)
	public void testCase3(Person paramOne) {
		System.out.println("Input" + paramOne.toString());
	}
}
