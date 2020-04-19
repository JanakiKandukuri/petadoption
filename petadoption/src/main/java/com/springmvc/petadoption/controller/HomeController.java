package com.springmvc.petadoption.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.petadoption.dao.LoginDAO;
import com.springmvc.petadoption.pojo.Login;
import com.springmvc.petadoption.pojo.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	public LoginDAO loginDao;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("login", new Login());
		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/signUp.htm", method = RequestMethod.GET)
	public String signUp() {
		return "signUp";
	}
	
	
	
	  @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public String loginProccess(@Valid @ModelAttribute("login") Login login, BindingResult bindingResult) {
		  
		  List<User> user = loginDao.getUserByEmail(login.getEmail(), login.getPassword());
		  
		  System.out.println(user);
		  
		  for(User u : user) {
			  	System.out.println(u.getUserId());
		  }
		  
	        if (bindingResult.hasErrors()) {
	            return "login";
	        }

	        return "signUp";
	    }

}
