package com.easymove.emApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easymove.emApp.model.Railway;

@Repository
public interface RailwayRepository extends JpaRepository<Railway, Integer>{
	
}
