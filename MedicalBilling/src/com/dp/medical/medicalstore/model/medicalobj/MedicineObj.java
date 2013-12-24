package com.dp.medical.medicalstore.model.medicalobj;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
@JsonAutoDetect
public class MedicineObj implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2606615701189448519L;
	/** Field mapping. */
	private Integer available;
	/** Field mapping. */
	private String description;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private String name;
	/** Field mapping. */
	private String unit;
	/** Field mapping. */
	private Double unitprice;
	public Integer getAvailable() {
		return available;
	}
	public void setAvailable(Integer available) {
		this.available = available;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}
}
