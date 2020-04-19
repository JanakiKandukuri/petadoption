package com.springmvc.petadoption.dao;

import com.springmvc.petadoption.pojo.Animal;

public class AnimalDAO extends DAO {

	public Animal getAnimalById(int animalId) {
		return getSession().get(Animal.class, animalId);
	}
}
