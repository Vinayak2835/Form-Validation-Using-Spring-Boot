package com.formvalidation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.formvalidation.model.Phone;
import com.formvalidation.model.Registration;

@Controller
public class FormController {

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String register(Model model) {

		Registration register = new Registration();

		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("9591626394");

		register.setPhone(phone);

		model.addAttribute("reg", register);

		return "registration";
	}

	@PostMapping("/register-process")
	public String registerProcess(@Valid @ModelAttribute("reg") Registration register, BindingResult result) {

		System.out.println(register);

		if (result.hasErrors()) {
			System.out.println("yess result has errors");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError error : allErrors) {
				System.out.println(error);
			}
			return "registration";
		}

		return "register-result";
	}
}
