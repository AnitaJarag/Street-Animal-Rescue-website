package com.animal.AnimalRescue.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animal.AnimalRescue.model.Contact;

@Repository
@Qualifier("ContactRepo")

public interface ContactRepository extends JpaRepository<Contact,Long>{

}
