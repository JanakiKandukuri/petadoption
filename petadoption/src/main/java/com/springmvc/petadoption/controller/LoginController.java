package com.springmvc.petadoption.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionAttributeStore;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import com.springmvc.petadoption.dao.LoginDAO;
import com.springmvc.petadoption.pojo.Login;
import com.springmvc.petadoption.pojo.User;

@Controller
@SessionAttributes("user")
public class LoginController {
	
	@Autowired
	public LoginDAO loginDao;
	
	@ModelAttribute("user")
	public User loginUser() {
		return new User();
	}
	
	
	  @RequestMapping(value = "/login", method = RequestMethod.POST)
	    public String loginProccess(@Valid @ModelAttribute("user") User user, BindingResult bindingResult,HttpSession session) {
		  
		  session.invalidate();
		  
		  System.out.println("here in lgin process");
		  
		  System.out.println(bindingResult);
		  
		  if (bindingResult.hasErrors()) {

			  System.out.println("binding result");
			  System.out.println(user.getEmail());
			  
	            return "login";
	        }
		  
		  
		  List<User> userList = loginDao.getUserByEmail(user.getEmail(), user.getPassword());
		  
		  System.out.println(user.getEmail());
		  
		  
		  if(!userList.isEmpty() && userList.size() < 2) {
			  
			  user.setUserId(userList.get(0).getUserId()); 
			  return "signUp";
			  
		  } else {
			  System.out.println("error");
			  return "login";
		  }
		 
	    }
	  
	  
	  @RequestMapping(value = "/logout")
	    public String loginOut(User user, SessionStatus sessionStatus,  WebRequest request) {
		  
		  sessionStatus.setComplete();
		  return "home";
		 
	    
	  }

}
