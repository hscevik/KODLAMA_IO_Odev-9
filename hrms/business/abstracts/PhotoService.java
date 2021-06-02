package com.hrms.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Photo;

public interface PhotoService {
	
	DataResult<List<Photo>> getAllByCandidate_Id(int candidateId);
	
	DataResult<List<Photo>> getAll();

	Result delete(int id);

	Result add(Photo photo, MultipartFile file);

}
