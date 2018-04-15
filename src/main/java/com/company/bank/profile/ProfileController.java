package com.company.bank.profile;

import java.util.List;

import org.apache.catalina.TomcatPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	/* We use the @PathVariable annotation on the id arg. in our URL Java method 
	 * That allows the {id} variable to be passed as arg. thru the URL Java method &
	 * then passed thru our profileService method call
	 */
	@RequestMapping("/profiles/{id}")
	public Profile getProfile (@PathVariable int id){
		return profileService.getProfile(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/profiles")
	public void addProfile (){
		
	}
	
	

}
 

