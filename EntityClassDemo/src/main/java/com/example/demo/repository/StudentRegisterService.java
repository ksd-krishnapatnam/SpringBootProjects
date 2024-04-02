package com.example.demo.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.StudentRegister;

@Service
public class StudentRegisterService {

	@Autowired
	StudentRegisterRepositroy registerRepository;
	
	public StudentRegister saveStudent(StudentRegister sr){
		sr.setRegistered_date(new Date());
		sr.setStatus(true);
		registerRepository.save(sr);
		return sr;
	}
	
	public Optional<StudentRegister> getStudentById(Long studentId) {
		Optional<StudentRegister> sr = registerRepository.findById(studentId);
		return sr;
	}
	
	public List<StudentRegister> getAllStudents(){
		return registerRepository.findAll();
	}
	
	public StudentRegister updateStudent(StudentRegister student,Long studentId) {
		
		Optional<StudentRegister> studentObj = registerRepository.findById(studentId);
		StudentRegister studentEntity = studentObj.get();
		studentEntity.setEmail_id(student.getEmail_id());
		studentEntity.setMobile_number(student.getMobile_number());
		studentEntity.setRegistered_date(new Date());
		studentEntity.setStatus(true);
		studentEntity.setStudent_name(student.getStudent_name());
		registerRepository.save(studentEntity);
		return studentEntity;
		
	}
}
