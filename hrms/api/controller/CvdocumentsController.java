package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.CvDocumentService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.cvDocument;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/cvDocument")
public class CvdocumentsController {
	
	private CvDocumentService cvDocumentService;
	@Autowired
	public CvdocumentsController(CvDocumentService cvDocumentService) {
		super();
		this.cvDocumentService = cvDocumentService;
	}
	
	@GetMapping("/getAllCvDocuments")
	public DataResult<List<cvDocument>> getAllCvDocuments(){
		
		return cvDocumentService.getAllCvDocuments();
	}
	@PostMapping("/addCvDocument")
	public Result addCvDocument(@RequestBody cvDocument cvDocument) {
		
		return cvDocumentService.addCvDocuments(cvDocument);
	}

}
