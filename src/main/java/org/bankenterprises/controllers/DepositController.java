package org.bankenterprises.controllers;

import org.bankenterprises.models.UserModel;
import org.bankenterprises.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deposit")
public class DepositController {

	@Autowired
	UserRepository userRepository;
	
	@PutMapping("/depositDetails")
	public String depositDetails(@RequestParam("userEmail") String userEmail, @RequestParam("accountType") String accountType, @RequestParam("depositAmount") int depositAmount)
	{
		UserModel userModel=userRepository.findByUserEmail(userEmail);
		System.out.println(userModel.toString());
		if(accountType.equals("savingsAccount")){
			userModel.getSam().setSavingsBalance(depositAmount + userModel.getSam().getSavingsBalance());
			System.out.println(userModel.getSam().getSavingsBalance());
			userRepository.save(userModel);
			System.out.println(userRepository.findAll().toString());
			
			return "added";
		}
		else if(accountType.equals("primaryAccount")){
			userModel.getPam().setPrimaryBalance(depositAmount + userModel.getPam().getPrimaryBalance());
			userRepository.save(userModel);
			return "added";
		}
		return "failed";
	}
}
