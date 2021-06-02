package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.ComputerSkill;

public interface ComputerSkillDao extends JpaRepository<ComputerSkill, Integer>{

}
