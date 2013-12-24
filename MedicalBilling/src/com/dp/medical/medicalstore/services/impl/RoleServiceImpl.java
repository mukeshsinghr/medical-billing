package com.dp.medical.medicalstore.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dp.genericdao.search.ISearch;
import com.dp.genericdao.search.Search;
import com.dp.medical.medicalstore.dao.RoleDAO;
import com.dp.medical.medicalstore.model.obj.medicalstore.Role;
import com.dp.medical.medicalstore.services.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	 private RoleDAO roleDAO;
	
	@Override
	public void save(Role role) {
		roleDAO.save(role);
	}

	@Override
	public List<Role> findAll() {
		return roleDAO.findAll();
	}

	@Override
	public Role findByName(String name) {
		return roleDAO.searchUnique(new Search().addFilterEqual("RoleName", name));
	}

	@Override
	public List<Map<String, Object>> findAllWithForDropdown() {
		Search s = new Search();
		s.addField("id");
		s.addField("RoleName");
		s.setResultMode(Search.RESULT_MAP);
		s.addSortAsc("RoleName");
		return roleDAO.search(s);
	}

	@Override
	public List<Role> search(ISearch search) {
		return roleDAO.search(search);
	}

	@Override
	public void delete(Long id) {
		roleDAO.removeById(id);
	}

	@Override
	public Role findById(Long id) {
		return roleDAO.find(id);
	}

}
