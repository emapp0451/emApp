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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@Entity
@Table(name="city", catalog="emapp")
public class City {

	public City() {
		
	}
	@Id
	@Column(name = "city_id")
	private Integer cityId;
	@Column(name = "city_name")
	private String cityName;
	@Column(name = "language_spoken")
	private String languageSpoken;
	@Column(name = "population")
	private String population;
	@Column(name = "weather")
	private String weather;
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name= "city_id", referencedColumnName = "city_id")
	private List<Area> areas;
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name= "rail_city_id", referencedColumnName = "city_id")
	private List<Railway> stations;
	@OneToMany( cascade = CascadeType.ALL)
	@JoinColumn(name= "air_city_id", referencedColumnName = "city_id")
	private List<Airport> airports;
	
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getLanguageSpoken() {
		return languageSpoken;
	}
	public void setLanguageSpoken(String languageSpoken) {
		this.languageSpoken = languageSpoken;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public List<Railway> getStations() {
		return stations;
	}
	public void setStations(List<Railway> stations) {
		this.stations = stations;
	}
	public List<Airport> getAirports() {
		return airports;
	}
	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}
	
}
