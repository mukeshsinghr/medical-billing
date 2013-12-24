package com.dp.medical.medicalstore.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dp.medical.medicalstore.dao.MedicineDao;
import com.dp.medical.medicalstore.model.obj.medicalstore.Medicine;

@Repository
public class MedicineDaoImpl implements MedicineDao {

	@Autowired
	SessionFactory sessionFactory;
	
	private Session openSession() {
		return sessionFactory.getCurrentSession();  
	}


	@SuppressWarnings("unchecked")
	public List<Medicine> findAll() {
		List<Medicine> lstMedicine = new ArrayList<Medicine>();
		Query query = openSession().createQuery("from Medicine u");
		lstMedicine = query.list();
		if (lstMedicine.size() > 0)
			return lstMedicine;
		else
			return null;
	}

}
