package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.AdvertService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Advert;
import com.hrms.hrms.entities.dtos.AdvertWithCompanyAndJobDto;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/adverts")
public class AdvertsContoller {
	
	private AdvertService advertService;
	
	@Autowired
	public AdvertsContoller(AdvertService advertService) {
		super();
		this.advertService = advertService;
	}

	
	@GetMapping("/getAll")
	public DataResult<List<Advert>>  getAllAdvert(){
		
		return advertService.getAllAdvert();
		
	}
	
	@GetMapping("/getActiveAdvertDetailList")
	public DataResult<List<AdvertWithCompanyAndJobDto>>  getActiveTrue(){
		
		return advertService.getAdvertWithCompanyAndJob();
		
	}
	
	@GetMapping("/getAllActiveDesc")
	public DataResult<List<Advert>> getAllByActiveTrueOrderByAdvertDateDesc(){
		
		return advertService.getAllByActiveTrueOrderByAdvertDateDesc();
	}

	@GetMapping("/getCompanyAdvertst")
	public DataResult<List<AdvertWithCompanyAndJobDto>>  getCompanyAdvertst(int id){
		
		return advertService.getCompanyAdvertsList(id);
		
	}
	
	@PostMapping("/add")
	public Result addAdvert(@RequestBody Advert advert) {
		
	return	advertService.addAdvert(advert);
		
	}
	
	@PostMapping("/advertActiveStatusChange")
	public Result advertActiveStatusChange(@RequestBody boolean status, int advertId) {
		return advertService.advertActiveStatusChange(status, advertId);
	}
}
