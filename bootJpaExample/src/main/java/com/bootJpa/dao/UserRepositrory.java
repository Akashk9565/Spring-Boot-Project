package com.bootJpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bootJpa.entities.User;

public interface UserRepositrory extends CrudRepository<User, Integer>{

	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name, String city);
	
	
	// JPQL Query
	
	@Query("select u from User u")
	public List<User> getAllUser();

	@Query("select u from User u where u.name =:n and u.city=:c")
	public List<User> getUserByName(@Param("n") String name, @Param("c") String city);
	
	// native query
	
	@Query(value="select * from employees", nativeQuery=true)
	public List<User> getUsers();


}
