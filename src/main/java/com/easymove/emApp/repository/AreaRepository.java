package com.easymove.emApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easymove.emApp.model.Area;
@Repository
public interface AreaRepository extends JpaRepository<Area, Integer>{

}
