package com.hrms.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_experiences")

@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","cvDocuments"})

public class JobExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "company_name")
	private String compantName;
	@Column(name = "position_name")
	private String positionName;
	@Column(name = "start_year")
	private String startYear;
	@Column(name = "finish_year")
	private String finishYear;

	
	@ManyToOne()
	@JoinColumn(name = "candidate_id",referencedColumnName = "id")
	private Candidate candidate;
	
	@OneToMany(mappedBy = "jobExperience")
	private List<cvDocument> cvDocuments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompantName() {
		return compantName;
	}

	public void setCompantName(String compantName) {
		this.compantName = compantName;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getFinishYear() {
		return finishYear;
	}

	public void setFinishYear(String finishYear) {
		this.finishYear = finishYear;
	}

	public Candidate getCandiate() {
		return candidate;
	}

	public void setCandiate(Candidate candiate) {
		this.candidate = candiate;
	}
}
