package com.springmvc.petadoption.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.petadoption.dao.AnimalDAO;
import com.springmvc.petadoption.pojo.Animal;


@Controller
public class AnimalController {
	
	@ModelAttribute("animal")
	public Animal saveAnimal() {
		return new Animal();
	}
	
	@RequestMapping(value = "/profileO", method = RequestMethod.GET)
	public ModelAndView getAnimal(@RequestParam("id") int id, AnimalDAO animalDao) {
		
		List<Animal> animal = animalDao.getAnimalByUserId(id);
		
		return new ModelAndView("owner", "animal", animal);
		
	}
	
	
	@RequestMapping(value = "/animal", method = RequestMethod.GET)
	public String getAnimalPage() {
		
//		List<Animal> animal = animalDao.getAnimalByUserId(id);
		
		return "animal";
		
	}
	
	
	@RequestMapping(value = "/animalSave", method = RequestMethod.POST)
	public String saveAnimal(@ModelAttribute("animal") @Validated Animal animal, BindingResult bindingResult,HttpSession session){
		
//		List<Animal> animal = animalDao.getAnimalByUserId(id);
		
		return "animal";
		
	}
	

}
