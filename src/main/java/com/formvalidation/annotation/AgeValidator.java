package com.formvalidation.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower;
	private int upper;
	private String message;

	public void initialize(Age age) {

		this.lower = age.lower();
		this.upper = age.upper();
		this.message = age.message();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {

		if (age == null) {
			return false;
		}
		if (age < lower || age > upper) {
			return false;
		} else {
			return true;
		}
	}

}
