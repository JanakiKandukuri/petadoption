package com.springmvc.petadoption.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.query.Query;

import com.springmvc.petadoption.pojo.User;

public class UserDAO extends DAO {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<User> getLoginUserByEmail(String email, String password ) {
		
		Query query = getSession().createQuery("from User where email=" +"'"+ email + "' and password="+"'"+password+"'");
		return query.list();
	}

	public String addUser(User userObj) throws SQLException {
		String result = "";
		try {
			getSession().beginTransaction();
			getSession().save(userObj);
			getSession().getTransaction().commit();
			
			result = "SuccessFully added new User " +userObj.getUserName();
			
		} catch (HibernateException e) {
			e.printStackTrace();
            getSession().getTransaction().rollback();
		} 
		
		return result;
	}

}
