package com.habile.demo;

import java.util.List;

public class ContactUs {

	String name;
	@Override
	public String toString() {
		return "ContactUs [name=" + name + ", fields=" + fields + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Field> getFields() {
		return fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
	List<Field> fields;
}
