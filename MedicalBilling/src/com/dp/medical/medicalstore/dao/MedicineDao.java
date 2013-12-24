package com.dp.medical.medicalstore.dao;

import java.util.List;

import com.dp.medical.medicalstore.model.obj.medicalstore.Medicine;

public interface MedicineDao {
	public List<Medicine> findAll();
}
