package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.StudentRegister;
import com.example.demo.repository.StudentRegisterService;

@RestController
@RequestMapping("/studentRegisteration")
public class StudentRegisterationController {
	
	@Autowired
	StudentRegisterService srs;

	@PostMapping("/save")
	public StudentRegister saveStudentReg(@RequestBody StudentRegister sr) {
		srs.saveStudent(sr);
		return sr;
	}
	
	@GetMapping("/getAll") //this method returns all students list
	public List<StudentRegister> getAllStudents(){
		return srs.getAllStudents();
	}
	
	@GetMapping("/getById/{studentId}") //this method returns student by using student id
	public Optional<StudentRegister> getStudentById(@PathVariable Long studentId) {
		Optional<StudentRegister> sr = srs.getStudentById(studentId);
		return sr;
	}
	
	@PutMapping("/getById/{studentId}")
	public StudentRegister updateStudentById(@RequestBody StudentRegister sr,@PathVariable Long studentId) {
		StudentRegister updatedStudent = srs.updateStudent(sr, studentId);
		return updatedStudent;
	}
}
