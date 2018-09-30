package org.dsi.services;

import java.util.List;

import org.dsi.Entity.Contacts;
import org.dsi.dao.ContactRepository;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ContactRestService {
	@Autowired
	private ContactRepository contactRepository;
	@RequestMapping(value="/Contacts",method=RequestMethod.GET)
	public List<Contacts> getcontacts(){
		return contactRepository.findAll();	
	}
@RequestMapping(value="/Contacts/{id}",method=RequestMethod.GET)
public Contacts getcontact(@PathVariable Long id) {
	return contactRepository.findOne(id);
}
@RequestMapping(value="/Contacts/save",method=RequestMethod.POST)
public Contacts save(Contacts c) {
	return contactRepository.save(c);
}}
