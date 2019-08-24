package com.easymove.emApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.easymove.emApp.model.City;
import com.easymove.emApp.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

	//get data based on cityid
	//List<Hospital> findAllByCityId(Integer cityId);
	//List<Hospital> findAllHospitalByCityId(Integer cityId);
	
	public final static String FIND_HOSPITAL_BY_CITY = "SELECT a FROM Hospital a where a.cityId =" +
            "(SELECT b.cityId from City b  where b.cityName = :cityName)";
			@Query(FIND_HOSPITAL_BY_CITY)
            List<Hospital> findAllHospitalByCityId(@Param("cityName") String cityName);
}
