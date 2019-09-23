package com.easymove.emApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.easymove.emApp.model.City;
import com.easymove.emApp.model.Hospital;
import com.easymove.emApp.model.HospitalAndArea;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

	//get data based on cityid
	//List<Hospital> findAllByCityId(Integer cityId);
	//List<Hospital> findAllHospitalByCityId(Integer cityId);
	
	public final static String FIND_HOSPITAL_BY_CITY = "SELECT a FROM Hospital a where a.cityId =" +
            "(SELECT b.cityId from City b  where b.cityName = :cityName)";
	
	public final static String FIND_HOSPITAL_AND_AREA = "select new com.easymove.emApp.model.HospitalAndArea(hos.hospitalName, hos.address, hos.contact, hos.description as hospital_description, " +
			 "are.area_name, are.description as area_description, are.safetyLevel, are.transportsAvailable, " +
			"are.market) from Hospital hos inner join Area are on hos.areaId = are.areaId and " +
			 "are.areaId in (select areaId from Hospital where specialization = :spec and "
			 + "cityId = (select cityId from City where cityName= :cityName))";
	
			@Query(FIND_HOSPITAL_BY_CITY)
            List<Hospital> findAllHospitalByCityId(@Param("cityName") String cityName);
			
			@Query(FIND_HOSPITAL_AND_AREA)
			List<HospitalAndArea> findAllHospitalAndArea(@Param("spec") String spec, @Param("cityName") String cityName);
			
			
}
