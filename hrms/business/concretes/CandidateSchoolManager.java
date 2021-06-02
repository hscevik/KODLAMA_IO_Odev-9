package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.CandidateSchoolService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.CandidateSchoolDao;
import com.hrms.hrms.entities.concretes.CandidateSchool;

@Service
public class CandidateSchoolManager implements CandidateSchoolService {

	private CandidateSchoolDao candidateschoolDao;
	
	@Autowired
	public CandidateSchoolManager(CandidateSchoolDao candidateschoolDao) {
		super();
		this.candidateschoolDao = candidateschoolDao;
	}

	@Override
	public DataResult<List<CandidateSchool>> getAllCandidateSchool() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CandidateSchool>>(candidateschoolDao.findAll(), "Data Listelendi.");
	}

	@Override
	public Result addCandidateSchool(CandidateSchool candidateSchool) {
		// TODO Auto-generated method stub
		candidateschoolDao.save(candidateSchool);
		return new  SuccessResult("Data Eklendi.");
	}

}
