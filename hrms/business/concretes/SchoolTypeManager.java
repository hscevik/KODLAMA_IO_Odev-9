package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.SchoolTypeService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.SchoolTypeDao;
import com.hrms.hrms.entities.concretes.SchoolType;

@Service
public class SchoolTypeManager implements SchoolTypeService{
	private SchoolTypeDao schoolTypeDao;
	
	@Autowired
	public SchoolTypeManager(SchoolTypeDao schoolTypeDao) {
		super();
		this.schoolTypeDao = schoolTypeDao;
	}

	@Override
	public DataResult<List<SchoolType>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<SchoolType>>(schoolTypeDao.findAll(),"Data Listelendi.");
	}
	@Override
	public Result addSchoolType(SchoolType schoolType) {
		this.schoolTypeDao.save(schoolType);
		return new SuccessResult("Data Eklendi.");
	}

}
