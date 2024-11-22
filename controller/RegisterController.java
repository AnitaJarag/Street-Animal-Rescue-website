package com.animal.AnimalRescue.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animal.AnimalRescue.model.Registration;
import com.animal.AnimalRescue.repository.RegisterRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/animal_rescue/")
public class RegisterController {
   
	@Autowired
    @Qualifier("regRepo")
    RegisterRepository regRepo;

	@GetMapping("/Registration")
	public ArrayList<Registration> Registration()
	{
		return(ArrayList<Registration>)regRepo.findAll();
	}
	@PostMapping("/Registration")
	public Registration handlepost(@RequestBody Registration r)
	{
		return regRepo.save(r);	
	}
	@GetMapping("/Registration/{email}/{password}")
	public Registration login(@PathVariable("email")String emailid,@PathVariable("password")String password)
	{
		return regRepo.findByEmailAndPassword(emailid,password);
	}
	
	

}
