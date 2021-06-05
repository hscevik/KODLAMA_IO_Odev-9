package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.CandidateSchoolService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.CandidateSchool;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/cadidateSchool")

public class CandidateSchoolsController {
	
	private CandidateSchoolService candidateSchoolService;

	@Autowired
	public CandidateSchoolsController(CandidateSchoolService candidateSchoolService) {
		super();
		this.candidateSchoolService = candidateSchoolService;
	}
	
	@GetMapping("/getAllCadidateSchool")
	public DataResult<List<CandidateSchool>> getAllCandidateSchool(){
		
		return candidateSchoolService.getAllCandidateSchool();
		
	}
	@GetMapping("/getCandidateSchoolsByFinishYearDesc")
	public DataResult<List<CandidateSchool>> getCandiateSchoolsByFinishYearDesc(int id){
		
		
		return candidateSchoolService.getCandidateSchoolsByFinishYearDesc(id);
	}
	
	@PostMapping("/addCandidateSchool")
	public Result adCandidateSchool(@RequestBody CandidateSchool candidateSchool)
	{
		
		
		return candidateSchoolService.addCandidateSchool(candidateSchool);
	}

}
