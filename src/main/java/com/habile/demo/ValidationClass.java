package com.habile.demo;

public class ValidationClass {

	boolean isMandatory;
	public boolean isMandatory() {
		return isMandatory;
	}
	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	public String getStringType() {
		return stringType;
	}
	public void setStringType(String stringType) {
		this.stringType = stringType;
	}
	@Override
	public String toString() {
		return "ValidationClass [isMandatory=" + isMandatory + ", stringType=" + stringType + ", minInclusive="
				+ minInclusive + ", maxInclusive=" + maxInclusive + ", isMultiSelection=" + isMultiSelection + "]";
	}
	public String getMinInclusive() {
		return minInclusive;
	}
	public void setMinInclusive(String minInclusive) {
		this.minInclusive = minInclusive;
	}
	public String getMaxInclusive() {
		return maxInclusive;
	}
	public void setMaxInclusive(String maxInclusive) {
		this.maxInclusive = maxInclusive;
	}
	public boolean isMultiSelection() {
		return isMultiSelection;
	}
	public void setMultiSelection(boolean isMultiSelection) {
		this.isMultiSelection = isMultiSelection;
	}
	String stringType;
	String minInclusive;
	String maxInclusive;
	boolean isMultiSelection;
}
