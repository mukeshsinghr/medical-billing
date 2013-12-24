package com.dp.medical.medicalstore.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dp.medical.medicalstore.dao.BaseDAO;
import com.dp.medical.medicalstore.dao.RoleDAO;
import com.dp.medical.medicalstore.model.obj.medicalstore.Role;

@Repository
public class RoleDAOImpl extends BaseDAO<Role, Long> implements RoleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public Role getRole(int id) {
		Role role = (Role) getCurrentSession().load(Role.class, id);
		return role;
	}	

}
