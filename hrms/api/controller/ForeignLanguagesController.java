package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hrms.hrms.business.abstracts.ForeignLanguageService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.ForeignLanguage;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/foreignLanguages")
public class ForeignLanguagesController {

	private ForeignLanguageService foreignLanguageService;
	@Autowired
	public ForeignLanguagesController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}
	
	@GetMapping("/getAllForeignLanguages")
	public DataResult<List<ForeignLanguage>> getAllForeignLanguage(){
		
		
		return foreignLanguageService.getAllForeignLanguages();
	}
	
	@PostMapping("/addForeignLanguage")
	public Result addForeignLanguage(@RequestBody ForeignLanguage foreignLanguage) {
		
		
		
		return foreignLanguageService.addForeignLanguage(foreignLanguage);
	}

}
