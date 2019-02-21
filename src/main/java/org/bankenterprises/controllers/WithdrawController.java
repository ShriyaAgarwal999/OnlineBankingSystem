package org.bankenterprises.controllers;

import org.bankenterprises.repository.PrimaryAccountRepository;
import org.bankenterprises.repository.SavingsAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/withdraw")
public class WithdrawController {
	
	@Autowired
	SavingsAccountRepository savingsAccountRepository;
	
	@Autowired
	PrimaryAccountRepository primaryAccountRepository;
	
	@GetMapping("/withdrawDetails")
	public void depositDetails(@RequestParam("userId") String userEmail,@RequestParam("accountType") String accountType,@RequestParam("withdrawAmount") int withdrawAmount)
	{
		int balance;
		if(accountType.equals("savingsAccount") && savingsAccountRepository.existsByUserEmail(userEmail))
		{
			balance=savingsAccountRepository.findByUserEmail(userEmail).getSavingsBalance();
			if(balance>withdrawAmount)
				savingsAccountRepository.findByUserEmail(userEmail).setSavingsBalance(balance-withdrawAmount);
			else
				System.out.println("low balance");
		}
		else if(accountType.equals("primaryAccount") && primaryAccountRepository.existsByUserEmail(userEmail))
		{
			balance=primaryAccountRepository.findByUserEmail(userEmail).getPrimaryBalance();
			if(balance>withdrawAmount)
				primaryAccountRepository.findByUserEmail(userEmail).setPrimaryBalance(balance-withdrawAmount);
			else
				System.out.println("low balance");
			
		}	
	}

}
