package org.bankenterprises.controllers;

import org.bankenterprises.models.PrimaryAccountModel;
import org.bankenterprises.models.SavingsAccountModel;
import org.bankenterprises.models.UserModel;
import org.bankenterprises.repository.PrimaryAccountRepository;
import org.bankenterprises.repository.SavingsAccountRepository;
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
	@Autowired
	SavingsAccountRepository savingsAccountRepository;
	@Autowired
	PrimaryAccountRepository primaryAccountRepository;
//	int userId=5;
	
	
	@PostMapping("/addUser")
	public void addUserDetails(@RequestBody UserModel userModel) 
	{
		
		userRepository.save(userModel);
		SavingsAccountModel savingsAccountModel=new SavingsAccountModel(userModel.getUserEmail(),userModel.getUserId(),0);
		savingsAccountRepository.save(savingsAccountModel);
		PrimaryAccountModel primaryAccountModel=new PrimaryAccountModel(userModel.getUserEmail(),userModel.getUserId(),0);
		primaryAccountRepository.save(primaryAccountModel);
		System.out.println("added");
//		userModel.setUserId(userId);
//		userId++;
		
	}

}
