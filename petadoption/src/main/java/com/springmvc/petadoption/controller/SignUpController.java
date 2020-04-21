package com.springmvc.petadoption.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.springmvc.petadoption.dao.LoginDAO;
import com.springmvc.petadoption.pojo.User;

@Controller
public class SignUpController {

	@Autowired
	public LoginDAO loginDao;

	@ModelAttribute("signUser")
	public User signUser() {
		return new User();
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signUp() {
		return "signUp";
	}

	@RequestMapping(value = "/signUpUser", method = RequestMethod.POST)
	public String loginProccess(@ModelAttribute("user") @Validated User user, BindingResult bindingResult,
			HttpSession session) {

		return "signUp";

	}

}
