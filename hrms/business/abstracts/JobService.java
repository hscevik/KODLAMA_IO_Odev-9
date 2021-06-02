package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Job;

public interface JobService {
	
	DataResult<List<Job>> getAllJob();
	List<Job> findByTitle(String Title);
	Result  addJob(Job job);

}
