package com.springmvc.petadoption.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.petadoption.dao.AnimalDAO;
import com.springmvc.petadoption.pojo.Animal;

@Controller
public class AnimalController {
	
	@RequestMapping(value = "/animal.htm", method = RequestMethod.GET)
	public ModelAndView getAnimal(AnimalDAO animalDao) {
		Animal animal = animalDao.getAnimalById(1);
		return new ModelAndView("animal", "animal", animal);
		
	}

}
