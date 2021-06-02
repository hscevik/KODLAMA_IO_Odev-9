package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.JobService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.ErrorResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.JobDao;
import com.hrms.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{

 private JobDao jobDao;
 
	@Autowired	
	public JobManager(JobDao jobDao) {
	super();
	this.jobDao = jobDao;
}

	@Override
	public DataResult<List<Job>>  getAllJob() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Data Listelendi");
				
	}

	@Override
		public Result addJob(Job job) {
		// TODO Auto-generated method stub
		if(findByTitle(job.getTitle()).size()>0)
		{
			return new ErrorResult("Bu pozisyon sistemde kayıtlı.");
		}else
		{
		this.jobDao.save(job);
		return new SuccessResult("Data Eklendi.");
		}
		
				
	}

	@Override
	public List<Job> findByTitle(String title) {
		// TODO Auto-generated method stub
		
		return this.jobDao.findByTitle(title);
	}



	

}
