package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.StudentRegister;

@Repository
public interface StudentRegisterRepositroy extends JpaRepository<StudentRegister, Long> {

	
}
