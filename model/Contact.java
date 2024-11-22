package com.animal.AnimalRescue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity	
public class Contact {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String fullname,email,phonenumber,subject;
public Contact() {
	super();
	// TODO Auto-generated constructor stub
}
public Contact(String fullname, String email, String phonenumber, String subject) {
	super();
	this.fullname = fullname;
	this.email = email;
	this.phonenumber = phonenumber;
	this.subject = subject;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}



}
