package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Akash", "Kumar", "Akashk9565@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Akshay", "Kumar", "Akshay99@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Ayush", "Kumar", "Ayush88@gamil.com");
//		studentRepository.save(student3);
//		
//		Student student4 = new Student("Animesh", "Banik", "Animesh77@gmail.com");
//		studentRepository.save(student4);
		
	} 

}
