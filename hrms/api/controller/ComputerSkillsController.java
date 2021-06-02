package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.ComputerSkillService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.ComputerSkill;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RequestMapping("/api/computerSkills")
@RestController
public class ComputerSkillsController {

	private ComputerSkillService computerSkillService;
	@Autowired
	public ComputerSkillsController(ComputerSkillService computerSkillService) {
		super();
		this.computerSkillService = computerSkillService;
	}
	@GetMapping("/getAllComputerSkills")
	public DataResult<List<ComputerSkill>> getAllComputerSkills(){
		
		
		return computerSkillService.getAllComputerSkills();
	}
	
	@PostMapping("/addComputerSkill")
	public Result addComputerSkills(@RequestBody ComputerSkill computerSkill) {
		
		
		return computerSkillService.addComputerSkill(computerSkill);
	}
	
}
