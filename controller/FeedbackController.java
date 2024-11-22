package com.animal.AnimalRescue.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animal.AnimalRescue.model.Feedback;
import com.animal.AnimalRescue.repository.FeedbackRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/animal_rescue/")
public class FeedbackController {
  
	@Autowired
      @Qualifier("FeedbackRepo")
      FeedbackRepository FeedbackRepo;
      
      @GetMapping("/Feedback")
      public ArrayList<Feedback> Feedback1()
      {
    	  return (ArrayList<Feedback>)FeedbackRepo.findAll();
      }
      @PostMapping("/Feedback")
      public Feedback
      SaveFeedback(@RequestBody Feedback f)
      { 
    	  return FeedbackRepo.save(f);
      }
      
      
 }
      

