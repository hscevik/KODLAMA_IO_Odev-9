package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.ForeignLanguageService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.ForeignLanguageDao;
import com.hrms.hrms.entities.concretes.ForeignLanguage;
@Service
public class ForeignLanguageManager implements ForeignLanguageService {
	
	private ForeignLanguageDao foreignLanguageDao;

	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAllForeignLanguages() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ForeignLanguage>>(foreignLanguageDao.findAll(), "Data Listelendi.");
	}

	@Override
	public Result addForeignLanguage(ForeignLanguage foreignLanguage) {
		// TODO Auto-generated method stub
		foreignLanguageDao.save(foreignLanguage);
		return new SuccessResult("Data Eklendi.");
	}

}
