package com.habile.demo;

import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {

	@RequestMapping(value = "/getJsonData/api", method = RequestMethod.GET)
	public ResponseEntity<JSONObject> getJsonData() throws JSONException {
		ResponseEntity<JSONObject> response = null;
		JSONObject jSONObject = new JSONObject();
		JSONArray jSONFieldArray = new JSONArray();
		

		jSONObject.put("name", "Contact Us");
		
		JSONObject jSONObject1 = new JSONObject();
		jSONObject1.put("name", "Name");
		jSONObject1.put("id", "Name");
		jSONObject1.put("type", "str");
		JSONObject jSONObject11 = new JSONObject();
		jSONObject11.put("isMandatory", "true");
		jSONObject11.put("stringType", "alpha");
		jSONObject1.put("validation", jSONObject11);
		
		JSONObject jSONObject2 = new JSONObject();
		jSONObject2.put("name", "Age");
		jSONObject2.put("id", "age");
		jSONObject2.put("type", "number");
		JSONObject jSONObject21 = new JSONObject();
		jSONObject21.put("isMandatory", "false");
		jSONObject21.put("minInclusive", "10");
		jSONObject21.put("maxInclusive", "10");
		jSONObject2.put("validation", jSONObject21);
		
		JSONObject jSONObject3 = new JSONObject();
		jSONObject3.put("name", "City");
		jSONObject3.put("id", "city");
		jSONObject3.put("type", "list");
		List<String> cityList = Arrays.asList("Chennai", "Bangalore", "Coimbatore");
		jSONObject3.put("Values", cityList);
		JSONObject jSONObject31 = new JSONObject();
		jSONObject31.put("isMandatory", true);
		jSONObject31.put("isMultiSelection", false);
		jSONObject3.put("validation", jSONObject31);
		jSONFieldArray.put(jSONObject1);
		jSONFieldArray.put(jSONObject2);
		jSONFieldArray.put(jSONObject3);

		jSONObject.put("fields", jSONFieldArray);
	      System.out.print(jSONObject);
	      response = new ResponseEntity<JSONObject>(jSONObject, HttpStatus.OK);
	      return response;
	}
}
