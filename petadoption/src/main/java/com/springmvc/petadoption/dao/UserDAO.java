package com.springmvc.petadoption.dao;

import com.springmvc.petadoption.pojo.User;

public class UserDAO extends DAO {
	
	public User getAnimalByEmail(String email ) {
		return getSession().get(User.class, email);
	}

}
