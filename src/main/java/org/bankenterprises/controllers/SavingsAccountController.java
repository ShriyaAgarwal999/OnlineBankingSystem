package org.bankenterprises.controllers;

import org.bankenterprises.repository.SavingsAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/savings")
public class SavingsAccountController {

	@Autowired
	SavingsAccountRepository savingsAccountRepository;
	
	@GetMapping("/balance")
	public int showBalance(@RequestParam("userEmail")String userEmail)
	{
		return savingsAccountRepository.findByUserEmail(userEmail).getSavingsBalance();
	}
}
