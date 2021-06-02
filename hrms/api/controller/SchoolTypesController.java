package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.SchoolTypeService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.SchoolType;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/schoolType")
public class SchoolTypesController {
	
	private SchoolTypeService schoolTypeService;
	
	@Autowired
	public SchoolTypesController(SchoolTypeService schoolTypeService) {
		super();
		this.schoolTypeService = schoolTypeService;
	}

	@GetMapping("/getAllSchoolType")
	public DataResult<List<SchoolType>> getAllSchoolType(){
		
		
		return schoolTypeService.getAll();
	}
	
	@PostMapping("/addSchoolType")
	public Result addSchoolType(@RequestBody SchoolType schoolTye) {
		
		return schoolTypeService.addSchoolType(schoolTye);
		
	}
	

}
