package com.spiders.softwaretrainingspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spiders.softwaretrainingspringboot.dto.StudentDto;

public interface StudentRepository extends JpaRepository<StudentDto, Integer> {
	
	boolean existsById(int studentId);
	
	boolean existsByEmail(String email);

}
