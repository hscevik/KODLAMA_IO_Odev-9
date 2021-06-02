package com.hrms.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrms.hrms.entities.concretes.Advert;
@Repository
public interface AdvertDao extends JpaRepository<Advert, Integer>{

	List<Advert> 	getAllByActiveTrue();
	
}