package com.springmvc.petadoption.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionAttributeStore;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

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

	@ModelAttribute("signUser")
	public User signUser() {
		return new User();
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login() {
		System.out.println("login");
		return "login";
	}
	
	
	  @RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	    public String loginProccess(@ModelAttribute("user") @Validated User user, BindingResult bindingResult,HttpSession session) {
		   
		  if (bindingResult.hasErrors()) {
	            return "login";
	        }
		  
		  
		  List<User> userList = loginDao.getUserByEmail(user.getEmail(), user.getPassword());
		  
		  if(!userList.isEmpty() && userList.size() < 2) {
			  
			  if(userList.get(0).getRole().equals("giver")) {
				  
				  user.setUserId(userList.get(0).getUserId()); 
				  
				  return "redirect:/profileO?id="+user.getUserId(); 
			  
			  } else if(userList.get(0).getRole().equals("adopt")) {
				 
				  user.setUserId(userList.get(0).getUserId()); 
				  return "Adoptor"; 
				  
			  } else {
				  
				  return "home";
			  }
			    
		  } else {
			  System.out.println("error");
			  return "login";
		  }
		 
	    }
	  
	  
	  @RequestMapping(value = "/logout")
	    public String loginOut(User user, SessionStatus sessionStatus,  WebRequest request) {
		  
		  sessionStatus.setComplete();
		  return "redirect:/logout";
		 
	    
	  }

}
