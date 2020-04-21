package com.springmvc.petadoption.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.petadoption.dao.AnimalDAO;
import com.springmvc.petadoption.pojo.Animal;

@Controller
public class AnimalController {
	
	@RequestMapping(value = "/profileO", method = RequestMethod.GET)
	public ModelAndView getAnimal(@RequestParam("id") int id, AnimalDAO animalDao) {
		
		List<Animal> animal = animalDao.getAnimalByUserId(id);
		
		return new ModelAndView("owner", "animal", animal);
		
	}

}
