package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.JobExperience;

public interface JobExperienceService {
	
	DataResult<List<JobExperience>> getAllJobExperiences();
	Result addJobExperience(JobExperience jobExperience);
	DataResult<List<JobExperience>> getCandidateJobExperiencesByCandidateIdIs(int id);

}
