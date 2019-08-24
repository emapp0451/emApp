package com.easymove.emApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easymove.emApp.model.City;
import com.easymove.emApp.model.Header;
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	//get City based on city name
	List<City> findAllCityByCityName(String cityName);

}
