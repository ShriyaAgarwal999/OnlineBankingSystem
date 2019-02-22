package org.bankenterprises.controllers;

import org.bankenterprises.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/savings")
public class SavingsAccountController {

	@Autowired
	UserRepository user;
	
	@GetMapping("/balance")
	public int showBalance(@RequestParam("userEmail")String userEmail)
	{
		return user.findByUserEmail(userEmail).getSam().getSavingsBalance();
	}
}
