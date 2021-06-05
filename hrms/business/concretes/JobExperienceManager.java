package com.hrms.hrms.business.concretes;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.JobExperienceService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.JobExperienceDao;
import com.hrms.hrms.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService {

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public DataResult<List<JobExperience>> getAllJobExperiences() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobExperience>>(jobExperienceDao.findAll(), "Data Listelendi.");
	}

	@Override
	public Result addJobExperience(JobExperience jobExperience) {
		jobExperienceDao.save(jobExperience);
		return new SuccessResult("Data Eklendi");
	}

	@Override
	public DataResult<List<JobExperience>> getCandidateJobExperiencesByCandidateIdIs(int id) {
		// TODO Auto-generated method stub
			return new SuccessDataResult<List<JobExperience>>(jobExperienceDao.getCandidateJobExperiencesByCandidateIdIs(id), "Data Listelendi.");
	}

}
