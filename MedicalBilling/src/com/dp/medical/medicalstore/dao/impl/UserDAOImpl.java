package com.dp.medical.medicalstore.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dp.medical.medicalstore.dao.BaseDAO;
import com.dp.medical.medicalstore.dao.UserDAO;
import com.dp.medical.medicalstore.model.obj.medicalstore.User;

@Repository
public class UserDAOImpl extends BaseDAO<User, Long> implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session openSession() {
		return sessionFactory.getCurrentSession();  
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public User getUser(String login) {
		
		List<User> userList = new ArrayList<User>();
		Query query = openSession().createQuery("from User u where u.username = :login");
		query.setParameter("login", login);
		userList = query.list();
		if (userList.size() > 0)
			return userList.get(0);
		else
			return null;
		
	}


}
