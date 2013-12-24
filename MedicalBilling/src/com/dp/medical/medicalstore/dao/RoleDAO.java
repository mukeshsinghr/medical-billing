package com.dp.medical.medicalstore.dao;

import com.dp.genericdao.dao.hibernate.GenericDAO;
import com.dp.medical.medicalstore.model.obj.medicalstore.Role;

public interface RoleDAO extends GenericDAO<Role, Long> {

	public Role getRole(int id);  
}
