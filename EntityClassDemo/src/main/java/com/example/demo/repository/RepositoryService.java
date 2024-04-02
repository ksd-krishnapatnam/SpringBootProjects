package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Student;

@Service
public class RepositoryService {

	@Autowired
	DemoRepository demorepository; 
	
	public List<Student> getAllStudents(){
		List<Student> list = new ArrayList<>();
		list = demorepository.findAll();
		return list;
	}
	
	public Optional<Student> findStudentById(Student student) {
		Optional<Student> studentById = demorepository.findById(null);
		return studentById;
	}
	
	
	public Student saveStudent(Student student) {
		student.setRegistered_date(new Date());
		return demorepository.save(student);
	}
	
}
