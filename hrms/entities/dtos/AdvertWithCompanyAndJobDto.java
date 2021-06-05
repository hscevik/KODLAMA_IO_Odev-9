package com.hrms.hrms.entities.dtos;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AdvertWithCompanyAndJobDto {

private	int id;
private	int numberOPosition;
private	Date advertDate;
private	Date deadlineDate;
private	String companyName;
private	String detail;

	
}
