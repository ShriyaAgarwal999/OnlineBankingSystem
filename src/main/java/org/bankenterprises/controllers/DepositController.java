package org.bankenterprises.controllers;

import org.bankenterprises.repository.PrimaryAccountRepository;
import org.bankenterprises.repository.SavingsAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deposit")
public class DepositController {

	@Autowired
	SavingsAccountRepository savingsAccountRepository;
	
	@Autowired
	PrimaryAccountRepository primaryAccountRepository;
	
	@GetMapping("/depositDetails")
	public void depositDetails(@RequestParam("userEmail") String userEmail, @RequestParam("accountType") String accountType, @RequestParam("depositAmount") int depositAmount)
	{
		int balance;
		if(accountType.equals("savingsAccount") && savingsAccountRepository.existsByUserEmail(userEmail))
		{
			balance=savingsAccountRepository.findByUserEmail(userEmail).getSavingsBalance();
			savingsAccountRepository.findByUserEmail(userEmail).setSavingsBalance(balance+depositAmount);
		}
		else if(accountType.equals("primaryAccount") && primaryAccountRepository.existsByUserEmail(userEmail))
		{
			balance=primaryAccountRepository.findByUserEmail(userEmail).getPrimaryBalance();
			primaryAccountRepository.findByUserEmail(userEmail).setPrimaryBalance(balance+depositAmount);
			
		}
		
	}
}
