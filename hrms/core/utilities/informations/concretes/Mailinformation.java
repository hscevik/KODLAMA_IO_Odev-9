package com.hrms.hrms.core.utilities.informations.concretes;

import com.hrms.hrms.core.utilities.informations.abstracts.Information;
import com.hrms.hrms.entities.abstracts.User;

public class Mailinformation implements Information{

	String message;
	
	@Override
	public void userInformation(User user, String message) {
		// TODO Auto-generated method stub
	this.message=user.getEMail()+"  "+message;
	}

	@Override
	public void activationCodeInformation(User user, String code) {
		this.message=user.getEMail()+" adresine "+code +" kodu gönderildi.";		
	}

	

}

