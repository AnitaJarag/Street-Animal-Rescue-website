package com.animal.AnimalRescue.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animal.AnimalRescue.model.Feedback;
@Repository
@Qualifier("FeedbackRepo")
public interface FeedbackRepository extends JpaRepository<Feedback,Long >{

}
