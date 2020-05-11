package com.learn.automation.webservices.json_simple;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleExample {

	public static void main(String[] args) throws IOException, ParseException {

		createJson();
		
		readJson();
		
	}

	private static void readJson() throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		String jsonString = FileUtils.readFileToString(new File("./src/test/resources/data/jsonData.json"), "UTF-8");
		
		JSONParser jsonParser = new JSONParser();
		JSONObject mainObj = (JSONObject) jsonParser.parse(jsonString);
		JSONArray dataArr = (JSONArray) mainObj.get("data");
		Iterator<JSONObject> dataObjItr = dataArr.iterator();
		
		while(dataObjItr.hasNext()) {
			JSONObject obj = dataObjItr.next();
			System.out.println("Email:" + obj.get("email"));
		}
	}

	private static void createJson() {
		// TODO Auto-generated method stub
		
//		{
//		  "persons": [
//		    {
//		      "name": "Jeevan",
//		      "place": "Shimoga",
//		      "time": "7:00"
//		    },
//		    {
//		      "name": "Jeevan",
//		      "place": "Shimoga",
//		      "time": "7:00"
//		    }
//		  ]
//		}
		JSONObject mainObject = new JSONObject();
		
		JSONArray personsArr = new JSONArray();
		
		JSONObject personObject = new JSONObject();
		personObject.put("name", "Jeevan");
		personObject.put("place", "Shimoga");
		personObject.put("time", "7:00");
		
		personsArr.add(personObject);
		
		mainObject.put("persons", personsArr);
		
		System.out.println(mainObject.toJSONString());
	}

}
