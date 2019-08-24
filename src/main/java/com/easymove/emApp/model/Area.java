package com.easymove.emApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="area", catalog="emapp")
public class Area {
	
	public Area() {
		
	}
	@Id
	@Column(name = "area_id")
	private Integer areaId;
	@Column(name = "area_name")
	private String area_name;
	@Column(name = "description")
	private String description;
	@Column(name = "saftey_level")
	private String safetyLevel;
	@Column(name = "transports_available")
	private String transportsAvailable;
	@Column(name="market", columnDefinition = "TEXT")
	private String market;
	@Column(name = "city_id")
	private Integer CityId;
	
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Integer getCityId() {
		return CityId;
	}
	public void setCityId(Integer cityId) {
		CityId = cityId;
	}

}
