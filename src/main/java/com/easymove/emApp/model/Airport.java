package com.easymove.emApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airport", catalog="emapp")
public class Airport {

	public Airport() {
		
	}
	@Id
	@Column(name = "airport_id")
	private Integer airportId;
	@Column(name = "airport_name")
	private String airportName;
	public Integer getAirportId() {
		return airportId;
	}
	public void setAirportId(Integer airportId) {
		this.airportId = airportId;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAirCityId() {
		return airCityId;
	}
	public void setAirCityId(Integer airCityId) {
		this.airCityId = airCityId;
	}
	@Column(name = "description")
	private String description;
	@Column(name = "air_city_id")
	private Integer airCityId;
	
	
}
