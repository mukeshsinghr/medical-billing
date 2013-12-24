package com.dp.medical.medicalstore.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dp.medical.medicalstore.model.medicalobj.MedicineObj;
import com.dp.medical.medicalstore.model.obj.medicalstore.Medicine;
import com.dp.medical.medicalstore.services.MedicineService;

@Controller
public class MedicineController {

	@Autowired
	MedicineService medicineService;
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(value = "/get_country_list",method = RequestMethod.GET,headers="Accept=application/json")
	public @ResponseBody List<MedicineObj> getCountryList(@RequestParam("term") String query) {
		System.out.println("in ajay call");
		List<MedicineObj> medicineList = simulateSearchResult(query);		
		return medicineList;
	}
	
	private List<MedicineObj> simulateSearchResult(String tagName) {
//		tagName = tagName.split(",")[1];
		List<MedicineObj> data = setMedicineObjValues(medicineService.findAll());	
		List<MedicineObj> result = new ArrayList<MedicineObj>();
 
		// iterate a list and filter by tagName
		for (MedicineObj tag : data) {
			if (tag.getName().contains(tagName)) {
				result.add(tag);
			}
		}
		System.out.println("in ajay call " + result);
		return result;
	}
	
	private List<MedicineObj> setMedicineObjValues (List<Medicine> data) {
		List<MedicineObj> returnObj = new ArrayList<MedicineObj>();
		MedicineObj medicineObj = null;
		for(Medicine m : data) {
			medicineObj = new MedicineObj();
			medicineObj.setAvailable(m.getAvailable());
			medicineObj.setDescription(m.getDescription());
			medicineObj.setId(m.getId());
			medicineObj.setName(m.getName());
			medicineObj.setUnitprice(m.getUnitprice());
			medicineObj.setUnit(m.getUnit());
			
			returnObj.add(medicineObj);
		}
		
		return returnObj;
	}
}
