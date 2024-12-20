package com.animal.AnimalRescue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
private String name,address,emailid,password;


public Registration() {
	super();
	// TODO Auto-generated constructor stub
}


public Registration(String name, String address, String emailid, String password) {
	super();
	this.name = name;
	this.address = address;
	this.emailid = emailid;
	this.password = password;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getEmailid() {
	return emailid;
}


public void setEmailid(String emailid) {
	this.emailid = emailid;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}

}