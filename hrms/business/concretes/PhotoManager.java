package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hrms.hrms.business.abstracts.PhotoService;
import com.hrms.hrms.core.adapters.concretes.CloudinaryAdapter;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.PhotoDao;
import com.hrms.hrms.entities.concretes.Photo;
@Service
public class PhotoManager implements PhotoService {
	
	@Autowired
	private CloudinaryAdapter cloudinaryService;
	private PhotoDao photoDao;
	
	
	@Autowired
	public PhotoManager(PhotoDao photoDao) {
		super();
		this.photoDao = photoDao;
	}

	@Override
	public DataResult<List<Photo>> getAllByCandidate_Id(int candidateId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Photo>>(photoDao.getAllByCandidate_Id(candidateId), "Data Listelendi.");
	}

	@Override
	public DataResult<List<Photo>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Photo>>(photoDao.findAll(), "Data Listelendi.");
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
	photoDao.deleteById(id);
		return new SuccessResult("Data Silindi.");
	}

	@Override
	public Result add(Photo photo, MultipartFile file) {
		// TODO Auto-generated method stub
		
		String url = cloudinaryService.uploadFile(file);
		photo.setPhotoUrl(url);
		photo.setName(file.getContentType());
		this.photoDao.save(photo);
		return new SuccessResult("Data Eklendi.");
	}

}
