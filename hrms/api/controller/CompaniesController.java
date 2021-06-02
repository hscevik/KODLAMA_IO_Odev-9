package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.CompanyService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Company;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {
	
	private CompanyService companyService;

	@Autowired
	public CompaniesController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Company>>  getAll(){
		
		return this.companyService.getCompanyAll();
		
		
	}
	
	@PostMapping("/add")
	public Result addCompany(@RequestBody Company company) {
		
		return this.companyService.addCompany(company);
	}

}
