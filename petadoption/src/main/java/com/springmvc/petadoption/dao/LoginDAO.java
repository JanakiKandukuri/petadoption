
package com.springmvc.petadoption.dao;

import org.hibernate.query.Query;
import java.util.List;
import com.springmvc.petadoption.pojo.User;

public class LoginDAO extends DAO {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<User> getUserByEmail(String email, String password ) {
		
		Query query = getSession().createQuery("from User where email=" +"'"+ email + "' and password="+"'"+password+"'");
		return query.list();
	}

}
