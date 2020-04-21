package com.springmvc.petadoption.dao;

import java.util.List;

import org.hibernate.query.Query;

import com.springmvc.petadoption.pojo.Animal;

public class AnimalDAO extends DAO {

	public Animal getAnimalById(int animalId) {
		return getSession().get(Animal.class, animalId);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Animal> getAnimalByUserId(int userId) {
		
		Query query = getSession().createQuery("from Animal where userId=" +"'"+ userId+"'");
		return query.list();
		
	}
}
