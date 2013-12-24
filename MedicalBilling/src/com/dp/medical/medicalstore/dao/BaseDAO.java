package com.dp.medical.medicalstore.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dp.genericdao.dao.hibernate.GenericDAOImpl;

/**
 * <p>
 * We have this base class for our GenericDAOs so that we don't have to override
 * and autowire the sessionFactory property for each one. That is the only
 * reason for having this class.
 * 
 * <p>
 * The @Autowired annotation tells Spring to inject the sessionFactory bean into
 * this setter method.
 * 
 * @author dharam
 */
public class BaseDAO<T, ID extends Serializable> extends GenericDAOImpl<T, ID> {

	@Autowired
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
}
