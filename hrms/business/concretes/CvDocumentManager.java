package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.CvDocumentService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.dataAccess.abstracts.CvDocumentDao;
import com.hrms.hrms.entities.concretes.cvDocument;

@Service
public class CvDocumentManager  implements CvDocumentService{
	
	private CvDocumentDao cvDocumentDao;
	@Autowired
	public CvDocumentManager(CvDocumentDao cvDocumentDao) {
		super();
		this.cvDocumentDao = cvDocumentDao;
	}

	@Override
	public DataResult<List<cvDocument>> getAllCvDocuments() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<cvDocument>>(cvDocumentDao.findAll(), "Data Listelendi.");
	}

	@Override
	public Result addCvDocuments(cvDocument cvDocument) {
		// TODO Auto-generated method stub
	cvDocumentDao.save(cvDocument);
		return new Result("Data Eklendi.");
	}

}
