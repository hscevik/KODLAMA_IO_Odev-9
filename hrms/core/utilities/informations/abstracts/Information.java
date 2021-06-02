package com.hrms.hrms.core.utilities.informations.abstracts;

import com.hrms.hrms.entities.abstracts.User;

public interface Information {
void userInformation(User user,String message);
void activationCodeInformation(User user,String code);
}
