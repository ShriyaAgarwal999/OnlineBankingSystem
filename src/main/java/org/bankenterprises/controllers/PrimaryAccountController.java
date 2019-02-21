package org.bankenterprises.controllers;

import org.bankenterprises.repository.PrimaryAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primary")
public class PrimaryAccountController {

	@Autowired
	PrimaryAccountRepository primaryAccountRepository;
	
	@GetMapping("/balance")
	public int showBalance(@RequestParam("userEmail")String userEmail)
	{
		return primaryAccountRepository.findByUserEmail(userEmail).getPrimaryBalance();
	}
}
