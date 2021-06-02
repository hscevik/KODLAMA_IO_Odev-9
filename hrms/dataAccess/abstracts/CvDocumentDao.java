package com.hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrms.hrms.entities.concretes.cvDocument;

public interface CvDocumentDao extends JpaRepository<cvDocument, Integer> {

}
