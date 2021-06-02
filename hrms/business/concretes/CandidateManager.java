package com.hrms.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.CandidateService;
import com.hrms.hrms.core.utilities.informations.concretes.Mailinformation;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.CandidateDao;
import com.hrms.hrms.dataAccess.abstracts.UserDao;
import com.hrms.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService{

private	CandidateDao candidateDao;
	
	
	@Autowired
	public CandidateManager(UserDao userDao,CandidateDao candidateDao) {
		this.candidateDao = candidateDao;
	}


	@Override
	
	public DataResult<List<Candidate>>  getCandidateAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Data Listeledi.") ;
	}


	@Override
	
	public Result addCandidate(Candidate candidate) {
		// TODO Auto-generated method stub
		Mailinformation mailBildirimi=new Mailinformation();
		mailBildirimi.userInformation(candidate.getUser(), "adresine mail bildirimi yapıldı.");
		mailBildirimi.activationCodeInformation(candidate.getUser(), "12345");
		 this.candidateDao.save(candidate);
		 return new SuccessResult("Data Eklendi");
		
	}

}
