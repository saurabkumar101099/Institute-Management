package com.spiders.softwaretrainingspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spiders.softwaretrainingspringboot.dto.StudentDto;
import com.spiders.softwaretrainingspringboot.service.StudentService;
import com.spiders.softwaretrainingspringboot.util.ResponseStructure;

@RestController
public class StudentController {
	
	@Autowired 
	
	StudentService studentService;
	
	
	@PostMapping("/student")
	
	public ResponseStructure<StudentDto> saveStudent(@RequestBody StudentDto studentDto){
		return studentService.saveStudent(studentDto);
	}
	
	@GetMapping("/student/{studentId}")
	public ResponseStructure<StudentDto> getStudentById(@PathVariable int studentId){
		return studentService.getStudentById(studentId);
	}

}
