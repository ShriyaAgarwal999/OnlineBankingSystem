package org.bankenterprises.controllers;

import java.util.List;

import org.bankenterprises.models.RecipientModel;
import org.bankenterprises.repository.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipient")
public class RecipientController {
	
	@Autowired
	RecipientRepository recipientRepository;
	
	@PostMapping("/addRecipient")
	public void addRecipient(@RequestBody RecipientModel recipientModel)
	{
		recipientRepository.save(recipientModel);
	}
	
	@GetMapping("/showRecipients")
	public List<RecipientModel> listOfRecipients(@RequestParam("userEmail")String userEmail)
	{
		return recipientRepository.findAllByUserEmail(userEmail);
	}
	
	@DeleteMapping("/deleteRecipient")
	public void deleteRecipient(@RequestParam("userEmail")String userEmail)
	{
		recipientRepository.delete(recipientRepository.findByUserEmail(userEmail));
	}
}
