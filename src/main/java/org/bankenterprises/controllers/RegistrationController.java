package org.bankenterprises.controllers;

import org.bankenterprises.models.PrimaryAccountModel;
import org.bankenterprises.models.SavingsAccountModel;
import org.bankenterprises.models.UserModel;
import org.bankenterprises.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegistrationController {

	@Autowired
	UserRepository userRepository;	

	@PostMapping("/addUser")
	public String addUserDetails(@RequestBody UserModel userModel) {
		if(userRepository.count()==0) { 
			userModel.setUserId(700000);
			userModel.setSam(new SavingsAccountModel(1000000, 0));
			userModel.setPam(new PrimaryAccountModel(2000000, 0));
			userRepository.save(userModel);
			return "first user added";
		} else if(!userRepository.existsByUserEmail(userModel.getUserEmail())){
			UserModel us = userRepository.findTop1ByOrderByUserIdDesc();
			userModel.setUserId(us.getUserId()+1);
			userModel.setSam(new SavingsAccountModel(us.getSam().getSavingsId()+1,0));
			userModel.setPam(new PrimaryAccountModel(us.getPam().getPrimaryId()+1,0));
			userRepository.save(userModel);
			return "new user added";
		}
		return null;
	}


}

