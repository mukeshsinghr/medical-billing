package com.dp.medical.medicalstore.services;

import java.util.List;

import com.dp.genericdao.search.ISearch;
import com.dp.genericdao.search.SearchResult;
import com.dp.medical.medicalstore.model.obj.medicalstore.User;

public interface UserService {
	
	public void save(User citizen);

	public void delete(Long id);

	public List<User> findAll();

	public List<User> search(ISearch search);

	public SearchResult<User> searchAndCount(ISearch search);

	public User findById(Long id);

	public User findByName(String name);

	public void flush();
//	public User getUser(String login); 
}
