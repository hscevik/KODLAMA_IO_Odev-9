package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.SchoolType;

public interface SchoolTypeDao extends JpaRepository<SchoolType, Integer>{

}
