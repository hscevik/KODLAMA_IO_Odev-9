package com.hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cv_documents")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class cvDocument {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String coverLetter;
	@Column(name = "github_adress")
	private String githubAddress;
	@Column(name = "linkedin_address")
	private String linkedinAddress;
	@Column(name = "other_address")
	private String otherAddress;
	@Column(name = "cv_status")
	private boolean cvStatus;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id",referencedColumnName = "id")
	private Candidate candidate;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_school_id",referencedColumnName = "id")
	private CandidateSchool candidateSchool;
	
	@ManyToOne()
	@JoinColumn(name = "job_experience_id",referencedColumnName = "id")
	private JobExperience jobExperience;
	
	@ManyToOne()
	@JoinColumn(name = "foreign_language_id",referencedColumnName = "id")
	private ForeignLanguage foreignLanguage;
	
	@ManyToOne()
	@JoinColumn(name = "computer_skill_id",referencedColumnName = "id")
	private ComputerSkill computerSkil;

}
