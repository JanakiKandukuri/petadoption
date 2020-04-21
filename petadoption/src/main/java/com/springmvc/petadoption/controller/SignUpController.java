package com.springmvc.petadoption.controller;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.springmvc.petadoption.dao.UserDAO;
import com.springmvc.petadoption.pojo.User;

@Controller
public class SignUpController {

	@Autowired
	public UserDAO userDao;

	@ModelAttribute("signUser")
	public User signUser() {
		return new User();
	}


	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public String signUp() {
		return "signUp";
	}

	@RequestMapping(value = "/signUpUser", method = RequestMethod.POST)
	public String signUp(@ModelAttribute("user") @Validated User user, BindingResult bindingResult,
			HttpSession session) {
		
//		System.out.println(user.getDateOfBirth());
//		System.out.println(user.toString());
////		System
		
		try {
			String result = userDao.addUser(user);
			
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "signUp";

	}

}
