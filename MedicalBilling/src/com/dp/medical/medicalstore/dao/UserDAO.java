package com.dp.medical.medicalstore.dao;

import com.dp.genericdao.dao.hibernate.GenericDAO;
import com.dp.medical.medicalstore.model.obj.medicalstore.User;

public interface UserDAO extends GenericDAO<User, Long> {
	public User getUser(String login);  
}
