package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.CandidateSchool;

public interface CandidateSchoolService {
	
	DataResult<List<CandidateSchool>> getAllCandidateSchool();
	DataResult<List<CandidateSchool>> getCandidateSchoolsByFinishYearDesc(int id);
	Result addCandidateSchool(CandidateSchool candidateSchool);

}
