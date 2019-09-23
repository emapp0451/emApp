package com.easymove.emApp.model;

public class HospitalAndArea {
	
	private String hospitalName;
	private String address;
	private String contact;
	private String hospital_description;
	private String area_name;
	private String area_description;
	private String safetyLevel;
	private String transportsAvailable;
	private String market;
	
	public HospitalAndArea(String hospitalName, String address, String contact, String hospital_description,
			String area_name, String area_description, String safetyLevel, String transportsAvailable,
			String market) {
		super();
		this.hospitalName = hospitalName;
		this.address = address;
		this.contact = contact;
		this.hospital_description = hospital_description;
		this.area_name = area_name;
		this.area_description = area_description;
		this.safetyLevel = safetyLevel;
		this.transportsAvailable = transportsAvailable;
		this.market = market;
	}
	
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getHospital_description() {
		return hospital_description;
	}
	public void setHospital_description(String hospital_description) {
		this.hospital_description = hospital_description;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getArea_description() {
		return area_description;
	}
	public void setArea_description(String area_description) {
		this.area_description = area_description;
	}
	
	public String getSafetyLevel() {
		return safetyLevel;
	}

	public void setSafetyLevel(String safetyLevel) {
		this.safetyLevel = safetyLevel;
	}

	public String getTransportsAvailable() {
		return transportsAvailable;
	}

	public void setTransportsAvailable(String transportsAvailable) {
		this.transportsAvailable = transportsAvailable;
	}

	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	
}
