package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.AdvertService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.AdvertDao;
import com.hrms.hrms.entities.concretes.Advert;

@Service
public class AdvertManager implements AdvertService{

	private AdvertDao advertDao;

	@Autowired
	public AdvertManager(AdvertDao advertDao) {
		super();
		this.advertDao = advertDao;
	}

	
	@Override
	public DataResult<List<Advert>> getAllAdvert() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Advert>>(advertDao.findAll(), "Data Listelendi.");
	}

	@Override
	public Result addAdvert(Advert advert) {
		// TODO Auto-generated method stub
		advertDao.save(advert);
		return new SuccessResult("Data Eklendi.");
	}


	@Override
	public DataResult<List<Advert>> getAllByActiveTrue() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Advert>>(advertDao.getAllByActiveTrue(),"Data Listelendi.");
	}


	




	
	

}
