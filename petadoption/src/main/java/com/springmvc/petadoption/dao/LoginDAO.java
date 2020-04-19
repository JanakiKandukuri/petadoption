
package com.springmvc.petadoption.dao;

import org.hibernate.query.Query;
import java.util.List;
import com.springmvc.petadoption.pojo.User;

public class LoginDAO extends DAO {
	
	@SuppressWarnings("rawtypes")
	public User getAnimalByEmail(String email, String password ) {
		
		String SQL_QUERY =" from User as o where o.userName=? and o.userPassword=?";
		Query query = getSession().createQuery(SQL_QUERY);
		query.setParameter(0,email);
		query.setParameter(1,password);
		List list = query.list();
		
//		System.out.println(list);
		
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		return getSession().get(User.class, email);
	}

}
