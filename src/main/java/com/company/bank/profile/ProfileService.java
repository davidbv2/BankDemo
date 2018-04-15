package com.company.bank.profile;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {
	
	/*convenient because there is only one copy of this list; whenever this service is called, 
	 * a new list doesn't have to be created
	 */
	private List<Profile> profiles = Arrays.asList(
			new Profile(1,"David Valentine II","123 Wayward","Grosse Pointe Park","MI",48214,3134325678L,"dvalent2"),
			new Profile(2,"Jesse James","234 Parkway","Ferndale","MI",48069,3134325467L,"jjames2"),
			new Profile(3,"Chip Clark","345 Jameson","Southfield","MI",48033,2484325467L,"cclark3"),
			new Profile(4,"Stacy Saltman","456 Peters","Oak Park","MI",48237,5864325467L,"ssaltman4"),
			new Profile(5,"Heather Heath","567 Franklin","Livonia","MI",48150,734432546L,"hheath5")
			);
	
	public List<Profile> getAllProfiles (){
		return profiles;
	}
	
	public Profile getProfile (int id){
		/*
		 * a lambda expression that conveniently allows us to iterate over our list of profiles 
		 * & match the ID that is passed as an arg. with the 
		 * first occurrence a profile with the same ID in our list, &
		 * then get an instance of that specific profile
		 */
		return profiles.stream().filter(p -> p.getId()==(id)).findFirst().get();
	
	}
			

}
