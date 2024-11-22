package com.animal.AnimalRescue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animal.AnimalRescue.model.Contact;
import com.animal.AnimalRescue.repository.ContactRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/animal_rescue/")

public class ContactConTroller {
	@Autowired
    @Qualifier("ContactRepo")
	ContactRepository ContactRepo;
    
    @GetMapping("/Contact")
    public String Contact()
    {
  	  return "Contact page";
    }
    @PostMapping("/Contact")
    public Contact
    SaveContact(@RequestBody Contact c)
    { 
  	  return ContactRepo.save(c);
    }
    
    
}

