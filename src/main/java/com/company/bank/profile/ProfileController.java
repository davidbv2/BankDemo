package com.company.bank.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//created an another package & also created this Controller in it 
@RestController
public class ProfileController {
	
	//this annotation marks this variable as needing dependency injection 
	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/profiles")
	public List<Profile> getAllProfiles (){
		return profileService.getAllProfiles();
	}

}
 

