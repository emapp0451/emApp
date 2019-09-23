package com.easymove.emApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.easymove.emApp.model.College;
import com.easymove.emApp.model.CollegeAndArea;
import com.easymove.emApp.model.Hospital;
import com.easymove.emApp.model.HospitalAndArea;

public interface CollegeRepository extends JpaRepository<College, Integer> {

	public final static String FIND_COLLEGE_BY_CITY = "SELECT a FROM College a where a.cityId =" +
            "(SELECT b.cityId from City b  where b.cityName = :cityName)";
	
	public final static String FIND_COLLEGE_AND_AREA = "select new com.easymove.emApp.model.CollegeAndArea(col.collegeName, col.course, col.type, col.university, col.address, col.collegeDescription, " + 
			"are.area_name, are.description, are.safetyLevel, are.transportsAvailable, are.market) from College col " + 
			"inner join Area are on col.areaId = are.areaId and are.areaId in " + 
			"(select areaId from College where type = :type and cityId = (select cityId from City where cityName = :cityName))";
	
	
	@Query(FIND_COLLEGE_BY_CITY)
    List<College> findAllCollegeByCityId(@Param("cityName") String cityName);
	
	@Query(FIND_COLLEGE_AND_AREA)
	List<CollegeAndArea> findCollegeAndArea(@Param("type") String spec, @Param("cityName") String cityName);
}