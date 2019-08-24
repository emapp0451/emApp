package com.easymove.emApp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Hospital", catalog="emapp")
public class Hospital {
	@Id
	@Column(name = "hospital_id")
	private Integer hospitalId;
	@Column(name = "hospital_name")
	private String hospitalName;
	@Column(name = "hospital_type")
	private String hospitalType;
	@Column(name = "address")
	private String address;
	@Column(name = "specialization")
	private String specialization;
	@Column(name = "contact")
	private String contact;
	@Column(name = "description", columnDefinition = "TEXT")
	private String  description;
	@Column(name = "accomodation", columnDefinition = "TEXT")
	private String accomodation;
	/*@ManyToMany
	@JoinTable(name = "city_hospital", joinColumns = {@JoinColumn(name="hospital_id") },
				inverseJoinColumns = {@JoinColumn(name="city_id")})
	private List<City> cities = new ArrayList<>();*/
	@Column(name = "city_id")
	private Integer cityId;
	@Column(name = "area_id")
	private Integer areaId;
	public Hospital() {
		
	}
	public Integer getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalType() {
		return hospitalType;
	}
	public void setHospitalType(String hospitalType) {
		this.hospitalType = hospitalType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAccomodation() {
		return accomodation;
	}
	public void setAccomodation(String accomodation) {
		this.accomodation = accomodation;
	}
	/*public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}*/
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	
	
}
