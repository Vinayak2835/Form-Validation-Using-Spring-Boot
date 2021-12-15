package com.formvalidation.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.formvalidation.model.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {
		
		return phone.getCountryCode()+"-"+phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		
		String[] phoneNumberArray = completePhoneNumber.split("-");
		
		int index = completePhoneNumber.indexOf('-');
		Phone phone = new Phone();
		
		if(index==-1 || completePhoneNumber.startsWith("-")) {
			phone.setCountryCode("91");
			phone.setUserNumber(phoneNumberArray[0]);
			
			if(completePhoneNumber.startsWith("-")) {
				phone.setUserNumber(phoneNumberArray[1]);
			}
		}
		else {
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}
		
		return phone;
	}

}
