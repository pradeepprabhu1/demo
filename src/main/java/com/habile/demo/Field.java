package com.habile.demo;

import java.util.List;

public class Field {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Field [name=" + name + ", id=" + id + ", type=" + type + ", values=" + values + ", validation="
				+ validation + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ValidationClass getValidation() {
		return validation;
	}
	public void setValidation(ValidationClass validation) {
		this.validation = validation;
	}
	String id;
	String type;
	String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	List<String> values;
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
	ValidationClass validation;
}
