package com.easymove.emApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="railway", catalog="emapp")
public class Railway {
	
	public Railway() {
		
	}
	@Id
	@Column(name = "railway_id")
	private Integer railwayId;
	@Column(name = "station_name")
	private String stationName;
	@Column(name = "description")
	private String description;
	@Column(name = "rail_city_id")
	private Integer railCityId;
	
	public Integer getRailwayId() {
		return railwayId;
	}
	public void setRailwayId(Integer railwayId) {
		this.railwayId = railwayId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getRailCityId() {
		return railCityId;
	}
	public void setRailCityId(Integer railCityId) {
		this.railCityId = railCityId;
	}
	
}
