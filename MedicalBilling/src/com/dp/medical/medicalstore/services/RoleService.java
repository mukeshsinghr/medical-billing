package com.dp.medical.medicalstore.services;

import java.util.List;
import java.util.Map;

import com.dp.genericdao.search.ISearch;
import com.dp.medical.medicalstore.model.obj.medicalstore.Role;

public interface RoleService {
//	public Role getRole(int id);  
	
	public void save(Role town);

	public List<Role> findAll();

	public Role findByName(String name);

	public List<Map<String,Object>> findAllWithForDropdown();
	
	public List<Role> search(ISearch search);
	
	public void delete(Long id);

	public Role findById(Long id);
}
