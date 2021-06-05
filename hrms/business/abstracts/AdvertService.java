package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.entities.concretes.Advert;
import com.hrms.hrms.entities.dtos.AdvertWithCompanyAndJobDto;

public interface AdvertService {

	DataResult<List<Advert>>  getAllAdvert();
	Result addAdvert(Advert advert);
	Result advertActiveStatusChange(boolean status,int advertId);

	DataResult<List<AdvertWithCompanyAndJobDto>>  getAdvertWithCompanyAndJob();
	DataResult<List<Advert>>  getAllByActiveTrueOrderByAdvertDateDesc();
	DataResult<List<AdvertWithCompanyAndJobDto>> getCompanyAdvertsList(int companyId);

}
