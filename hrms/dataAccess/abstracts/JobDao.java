package com.hrms.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer>{
	
	List<Job> findByTitle(String title);
}
