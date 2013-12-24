package com.dp.medical.medicalstore.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dp.genericdao.search.ISearch;
import com.dp.genericdao.search.Search;
import com.dp.genericdao.search.SearchResult;
import com.dp.medical.medicalstore.dao.UserDAO;
import com.dp.medical.medicalstore.model.obj.medicalstore.User;
import com.dp.medical.medicalstore.services.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	
//	@Override
//	public User getUser(String login) {
//		return userDAO.getUser(login); 
//	}


	@Override
	public void save(User user) {
		userDAO.save(user);
	}


	@Override
	public void delete(Long id) {
		userDAO.removeById(id);
	}


	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}


	@Override
	public List<User> search(ISearch search) {
		return userDAO.search(search);
	}


	@Override
	public SearchResult<User> searchAndCount(ISearch search) {
		return userDAO.searchAndCount(search);
	}


	@Override
	public User findById(Long id) {
		return userDAO.find(id);
	}


	@Override
	public User findByName(String name) {
		if (name == null)
			return null;
		return userDAO.searchUnique(new Search().addFilterEqual("username", name));
	}


	@Override
	public void flush() {
		userDAO.flush();
	}

}
