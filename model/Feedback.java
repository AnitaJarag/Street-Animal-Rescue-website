package com.animal.AnimalRescue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private long id;
   private String name,phoneno,emailaddress,suggestion;
public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}
public Feedback(String name, String phoneno, String emailaddress, String suggestion) {
	super();
	this.name = name;
	this.phoneno = phoneno;
	this.emailaddress = emailaddress;
	this.suggestion = suggestion;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public String getEmailaddress() {
	return emailaddress;
}
public void setEmailaddress(String emailaddress) {
	this.emailaddress = emailaddress;
}
public String getSuggestion() {
	return suggestion;
}
public void setSuggestion(String suggestion) {
	this.suggestion = suggestion;
}


}