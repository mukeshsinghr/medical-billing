package com.dp.medical.medicalstore.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dp.medical.medicalstore.dao.MedicineDao;
import com.dp.medical.medicalstore.model.obj.medicalstore.Medicine;
import com.dp.medical.medicalstore.services.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	MedicineDao medicineDao;
	
	@Transactional
	public List<Medicine> findAll() {
		return medicineDao.findAll();
	}

}
