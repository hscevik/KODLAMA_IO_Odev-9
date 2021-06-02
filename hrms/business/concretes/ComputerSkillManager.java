package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.ComputerSkillService;
import com.hrms.hrms.core.utilities.results.DataResult;
import com.hrms.hrms.core.utilities.results.Result;
import com.hrms.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.hrms.core.utilities.results.SuccessResult;
import com.hrms.hrms.dataAccess.abstracts.ComputerSkillDao;
import com.hrms.hrms.entities.concretes.ComputerSkill;

@Service
public class ComputerSkillManager implements ComputerSkillService{

	private ComputerSkillDao computerSkilldao;
	
	@Autowired
	public ComputerSkillManager(ComputerSkillDao computerSkilldao) {
		super();
		this.computerSkilldao = computerSkilldao;
	}

	@Override
	public DataResult<List<ComputerSkill>> getAllComputerSkills() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ComputerSkill>>(computerSkilldao.findAll(), "Data Listelendi.");
	}

	@Override
	public Result addComputerSkill(ComputerSkill computerSkill) {
		// TODO Auto-generated method stub
		computerSkilldao.save(computerSkill);
		return new SuccessResult("Data Eklendi.");
	}

}
