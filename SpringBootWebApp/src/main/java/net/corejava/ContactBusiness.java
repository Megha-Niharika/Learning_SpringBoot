package net.corejava;

import java.util.List;
import java.util.ArrayList;


public class ContactBusiness {

	
	public List<Contact> getContactList(){
		
		List<Contact> listContact = new ArrayList<>(); 
		
		listContact.add(new Contact("megha","megha@gmail.com","tumkur"));
		listContact.add(new Contact("niharika","niha@gmail.com","banglore"));
		listContact.add(new Contact("abhay","abhay@gmail.com","mumbai"));
		listContact.add(new Contact("vivian","vivian@gmail.com","delhi"));
		
		
		
		return listContact;
		
		
	}
}
