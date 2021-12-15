package com.formvalidation.model;

public class Phone {

	private String countryCode;

	private String userNumber;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String countryCode, String userNumber) {
		super();
		this.countryCode = countryCode;
		this.userNumber = userNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "Phone [countryCode=" + countryCode + ", userNumber=" + userNumber + "]";
	}
}
