package com.learn.automation.collection;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 20;
		Integer ageInt = 20;
		
		String name = "Jeevan";
		name = name + " adiga";
		System.out.println(name);
		
		double percentage = 10.2;
		Double percentageDouble = 10.2;
		
//		boolean - Boolean - true/false
		
		Client client = new Client();
		client.setFirstName("Jeevan");
		client.setLastName("Adiga");
		client.setAge(45);
		System.out.println(client);		
	}

}
