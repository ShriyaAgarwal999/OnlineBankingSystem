package org.bankenterprises.controllers;

import org.bankenterprises.models.PrimaryAccountModel;
import org.bankenterprises.models.SavingsAccountModel;
import org.bankenterprises.models.UserModel;
import org.bankenterprises.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/withdraw")
public class WithdrawController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/withdrawDetails")
	public String depositDetails(@RequestParam("userEmail") String userEmail,@RequestParam("accountType") String accountType,@RequestParam("withdrawAmount") int withdrawAmount)
	{
		UserModel userModel=userRepository.findByUserEmail(userEmail);

		if(accountType.equals("savingsAccount") && (userModel.getSam().getSavingsBalance()>withdrawAmount) ) {
			userModel.setSam(new SavingsAccountModel(userModel.getSam().getSavingsId(),userModel.getSam().getSavingsBalance()-withdrawAmount));
			userRepository.save(userModel);
			return "debited";
		}
		else if(accountType.equals("primaryAccount") && (userModel.getPam().getPrimaryBalance()>withdrawAmount))
		{
			userModel.setPam(new PrimaryAccountModel(userModel.getPam().getPrimaryId(),userModel.getPam().getPrimaryBalance()-withdrawAmount));
			userRepository.save(userModel);
			return "debited";
			
		}
		return "Your balance id low!";
	}
}
