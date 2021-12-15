package com.formvalidation.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.formvalidation.annotation.Age;

public class Registration {

	@Size(min = 4, max = 7, message = " *userName should be between 4 to 10 characters")
	private String userName;

	@NotBlank(message = " * password shouldn't be blank")
	private String password;
    
	
	private Phone phone;
	
	@Age(lower=18,upper=30,message="Age should be between 18 to 30")
	private Integer age;

	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registration(String userName, String password, Phone phone,Integer age) {
		super();
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.age=age;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Registration [userName=" + userName + ", password=" + password + ", phone=" + phone + ", age=" + age
				+ "]";
	}

	

}
