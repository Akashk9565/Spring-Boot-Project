package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	
	Student saveStudent(Student student);

	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
