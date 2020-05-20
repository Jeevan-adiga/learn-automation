package com.learn.automation.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> stringList = new ArrayList<String>();
		stringList.add("abc");
		stringList.add("xyz");
		
		List<String> stringListAgain = new ArrayList<String>(Arrays.asList("mno", "pq"));
		for(String stringVar : stringListAgain) {
			System.out.println(stringVar);
		}
		
		System.out.println(stringListAgain.contains("mno"));
		// get
		
		List<Client> clientList = new ArrayList<Client>();
		clientList.add(new Client());
		clientList.get(0);
		
		
		HashSet<String> stringSet = new HashSet<String>(Arrays.asList("mno", "pq"));
		
		// key - value
		// name - jeevan
		// work - IT
		// place - Karnataka
		
		HashMap<String, String> stringMap = new HashMap<>();
		stringMap.put("name", "jeevan");
		
		for(Map.Entry<String, String> record : stringMap.entrySet()) {
			System.out.println(record.getKey()+" - "+record.getValue());
		}
		
	}

}
