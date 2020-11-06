package com.habile.demo;

import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BasicFormController {

	@RequestMapping(value = "/getJsonData", method = RequestMethod.GET)
	public ResponseEntity<ContactUs> getJsonData() throws JSONException {
		ResponseEntity<ContactUs> response = null;
		ContactUs contactUsObj = new ContactUs();
		
		contactUsObj.setName("Contact Us");
		
		Field field1 = new Field();
		field1.setName("Name");
		field1.setId("Name");
		field1.setType("str");
		ValidationClass val = new ValidationClass();
		val.setMandatory(true);
		val.setStringType("str");
		field1.setValidation(val);
		
		Field field2 = new Field();
		field2.setName("Age");
		field2.setId("age");
		field2.setType("number");
		ValidationClass val1 = new ValidationClass();
		val1.setMandatory(false);
		val1.setMaxInclusive("10");
		val1.setMinInclusive("10");
		field2.setValidation(val1);
		
		Field field3 = new Field();
		field3.setName("City");
		field3.setId("city");
		field3.setType("list");
		List<String> cityList = Arrays.asList("Chennai", "Bangalore", "Coimbatore");
		field3.setValues(cityList);
		ValidationClass val2 = new ValidationClass();
		val2.setMandatory(true);
		val2.setMultiSelection(true);
		field3.setValidation(val2);
		List<Field> fields = Arrays.asList(field1, field2, field3);
		contactUsObj.setFields(fields);
		
	      System.out.print(contactUsObj.toString());
	      response = new ResponseEntity<ContactUs>(contactUsObj, HttpStatus.OK);
	      return response;
	}
	
	
	@RequestMapping(value = "/showJsonData", method = RequestMethod.GET)
	public ResponseEntity<ContactUs> showJsonData() throws JSONException {
		ResponseEntity<ContactUs> response = null;
		ContactUs contactUsObj = new ContactUs();
		Field field1 = new Field();
		field1.setName("Name");
		field1.setId("Name");
		field1.setType("str");
		field1.setValue("Pradeep");
		ValidationClass val1 = new ValidationClass();
		val1.setMandatory(false);
		val1.setMaxInclusive("10");
		val1.setMinInclusive("10");
		field1.setValidation(val1);
		
		Field field2 = new Field();
		field2.setName("Age");
		field2.setId("age");
		field2.setType("str");
		field2.setValue("10");
		field2.setValidation(val1);
		
		
		Field field3 = new Field();
		field3.setName("City");
		field3.setId("city");
		field3.setType("str");
		field3.setValue("Chennai");
		field3.setValidation(val1);
		
		List<Field> fields = Arrays.asList(field1, field2, field3);
		contactUsObj.setFields(fields);
		
	      System.out.print(contactUsObj.toString());
	      response = new ResponseEntity<ContactUs>(contactUsObj, HttpStatus.OK);
	      return response;
	}
}
