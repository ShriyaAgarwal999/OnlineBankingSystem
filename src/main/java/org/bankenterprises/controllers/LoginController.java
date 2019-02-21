package org.bankenterprises.controllers;

import org.bankenterprises.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/getAllDetails")
	public String getAllDetails(@RequestParam("userId") String userEmail, @RequestParam("userPassword") String userPassword)
	{
		
		if(userRepository.existsByUserEmail(userEmail)) 
			if(userRepository.findByUserEmail(userEmail).getUserPassword().equals(userPassword))
				return "login Successful";
			
		return null;
		
//		
//		UserModel user=userRepository.findByUserId(userId);
//		
//		if(userId==user.getUserId())
//		{
//			String pass=user.getUserPassword();
//			
//			System.out.println(pass);
//			if(pass.equals(userPassword))
//			{
//				System.out.println(user.getUserFirstName());
//				return userRepository.findByUserId(userId);
//			}
//			else
//			{
//				System.out.println("password not identified");
//				return null;
//			}
//		}
//		else
//		{
//			System.out.println("id not identified");
//			return null;
//		}
//	}
//	
	
	
	}	
}