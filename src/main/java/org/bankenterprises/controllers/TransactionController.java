package org.bankenterprises.controllers;

import java.util.List;

import org.bankenterprises.models.TransactionDetailsModel;
import org.bankenterprises.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@GetMapping("/details")
	public List<TransactionDetailsModel> getDetails(@RequestParam("userId") int userId,@RequestParam("accountType") String accountType)
	{
		return transactionRepository.findAllByUserId(userId);
	}

	@PostMapping("/addTransaction")
	public void addTransaction(@RequestBody TransactionDetailsModel transactionModel )
	{
		transactionRepository.save(transactionModel);
	}
}
