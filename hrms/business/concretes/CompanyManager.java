package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.CompanyService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.CompanyDao;
import com.hrms.hrms.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService {

	CompanyDao companyDao;
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public DataResult<List<Company>>  getCompanyAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Company>>(this.companyDao.findAll(),"Data Listelendi.") ;
	}

	@Override
	public Result addCompany(Company company) {
		// TODO Auto-generated method stub
		 this.companyDao.save(company);
		 return new SuccessResult("Data Eklendi.");
	}

}
