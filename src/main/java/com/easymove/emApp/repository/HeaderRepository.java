package com.easymove.emApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.easymove.emApp.model.Header;
import com.easymove.emApp.model.Hospital;

public interface HeaderRepository extends JpaRepository<Header, Integer>{
	
	//get header based on city
	List<Header> findAllHeaderByHeaderName(String headerName);
}
