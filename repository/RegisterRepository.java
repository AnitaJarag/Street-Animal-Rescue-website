package com.animal.AnimalRescue.repository;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.animal.AnimalRescue.model.Registration;


@Repository
@Qualifier("regRepo")
public interface RegisterRepository extends JpaRepository<Registration, Long>{
 //Query for login
	@Query(nativeQuery=true,value="select* from registration where emailid=:email and password=:password")
	Registration findByEmailAndPassword(@Param("email")String emailid,@Param("password")String password);
}
