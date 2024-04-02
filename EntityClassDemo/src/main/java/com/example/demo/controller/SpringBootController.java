package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;
import com.example.demo.repository.RepositoryService;

@RestController
@RequestMapping("/SpringBootController")
public class SpringBootController {

	@Autowired
	RepositoryService repositoryService;

//	@GetMapping("/getAllStudents")
//	public List<Student> getAllStudents(){
//		return repositoryService.getAllStudents();
//	}

	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		return repositoryService.getAllStudents();
	}

	@PostMapping("/saveStudent")
	public Student saveStudentDetails(@RequestBody Student student) {
		return repositoryService.saveStudent(student);
	}
	
	@GetMapping("/findById")
	public Optional<Student> findStudentById(Student student) {
		return repositoryService.findStudentById(student);
	}

}
