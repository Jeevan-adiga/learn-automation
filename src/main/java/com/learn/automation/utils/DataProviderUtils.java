package com.learn.automation.utils;

import org.testng.annotations.DataProvider;

import com.learn.automation.pojo.Person;

public class DataProviderUtils {

	@DataProvider(name="provideDataFromClass")
	public static Object[][] provideDataExample() {
		
		Object[][] data = new Object[5][1]; // number of iteration : number of params
		data[0][0] = new Person("Jack", "Sparrow");
		data[1][0] = new Person("Penny", "");
		data[2][0] = new Person("Chandler", "Bing");
		data[3][0] = new Person("Don", "Draper");
		data[4][0] = new Person("Sheldon", "Cooper");
		return data;
	}
}
