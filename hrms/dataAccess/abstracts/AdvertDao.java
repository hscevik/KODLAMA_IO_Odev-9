package com.hrms.hrms.dataAccess.abstracts;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.hrms.hrms.entities.concretes.Advert;
import com.hrms.hrms.entities.dtos.AdvertWithCompanyAndJobDto;
@EnableJpaRepositories
public interface AdvertDao extends JpaRepository<Advert, Integer>{


	@Query("Select new com.hrms.hrms.entities.dtos.AdvertWithCompanyAndJobDto"
			+"(a.id,a.numberOfPosition,a.advertDate,a.deadlineDate,c.companyName,a.detail)"
			+" From Advert a  Inner Join a.company c where a.active=true")
	List<AdvertWithCompanyAndJobDto> getAdvertWithCompanyAndJob();

	@Query("Select new com.hrms.hrms.entities.dtos.AdvertWithCompanyAndJobDto"
		+"(a.id,a.numberOfPosition,a.advertDate,a.deadlineDate,c.companyName,a.detail)"
		+" From Advert a  Inner Join a.company c where a.active=true and a.id=:companyId")
	List<AdvertWithCompanyAndJobDto> getCompanyAdvertsList(int companyId);
	
	List<Advert> getAllByActiveTrueOrderByAdvertDateDesc();
	
	@Modifying
	@Transactional
	@Query("update  Advert a set a.active=:status where a.id=:advertId")
	void advertActiveStatusChange(boolean status,int advertId);
	
}