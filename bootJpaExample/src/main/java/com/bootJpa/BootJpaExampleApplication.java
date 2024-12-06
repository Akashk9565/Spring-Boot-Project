package com.bootJpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bootJpa.dao.UserRepositrory;
import com.bootJpa.entities.User;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootJpaExampleApplication.class, args);

		UserRepositrory userRepository = context.getBean(UserRepositrory.class);

		/*
		 * // Create Object of User User user = new User(); user.setName("Akash");
		 * user.setCity("Noida"); user.setStatus("Java Developer");
		 * 
		 * //User user1 = userRepository.save(user); //System.out.println(user1);
		 * 
		 * User user1 = new User(); user1.setName("Akshay"); user1.setCity("Delhi");
		 * user1.setStatus("Python Developer");
		 * 
		 * List<User> users = List.of(user,user1);
		 * 
		 * // Save Multiple object Iterable<User> result =
		 * userRepository.saveAll(users);
		 * 
		 * result.forEach(user2->{ System.out.println(user2); });
		 * 
		 * System.out.println("done");
		 */

		// update user ById

//		Optional<User> optional= userRepository.findById(53);
//		User user = optional.get();
//		user.setStatus("Python Developer");
//		User resul = userRepository.save(user);
//		System.out.println(resul);

		// how to get data findAll

//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user -> {
//			System.out.println(user);
//		});

		// Deleting the user element

//		userRepository.deleteById(52);
//		System.out.println("delete success");

		
		// Custom find method
		
//		List<User> users= userRepository.findByName("Akshay");
//		users.forEach(e->System.out.println(e));
		
//		List<User> users = userRepository.findByNameAndCity("Akshay","Delhi");
//		users.forEach(e->System.out.println(e));
	
		
		// JPQL Query
	
//		List<User> alluser = userRepository.getAllUser();
//		alluser.forEach(e->System.out.println(e));
		
//		List<User> userByName = userRepository.getUserByName("Akshay","Delhi");
//		userByName.forEach(e->System.out.println(e));
		
		// native Query
		
		
		userRepository.getUsers().forEach(e->System.out.println(e));
		
		
	}

}
