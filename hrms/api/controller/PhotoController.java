package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hrms.hrms.business.abstracts.PhotoService;
import com.hrms.hrms.core.adapters.concretes.CloudinaryAdapter;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Photo;

@RequestMapping("/api/photo")
@RestController
public class PhotoController {
	
	private CloudinaryAdapter cloudinaryService;
	private PhotoService photoService;

	@Autowired
	public PhotoController(CloudinaryAdapter cloudinaryService, PhotoService photoService) {
		super();
		this.cloudinaryService = cloudinaryService;
		this.photoService = photoService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Photo>> getAll(){
		return this.photoService.getAll();
	}
	
	@GetMapping("/getAllByCandidateId")
	public DataResult<List<Photo>> getAllByCandidate_Id(int id){
		return this.photoService.getAllByCandidate_Id(id);
	}
	
	@PostMapping("/upload")
	public Result uploadFile(@RequestParam("file") MultipartFile file, Photo photo) {
		return this.photoService.add(photo, file);

	}
	

}
