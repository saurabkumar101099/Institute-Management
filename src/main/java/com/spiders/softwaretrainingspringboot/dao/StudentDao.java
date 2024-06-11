package com.spiders.softwaretrainingspringboot.dao;

import java.util.ArrayList;

import com.spiders.softwaretrainingspringboot.dto.StudentDto;

public interface StudentDao {
	
	StudentDto saveStudent(StudentDto studentDto);
	
	StudentDto getStudentById(int studentId);
	
	StudentDto updateStudent(StudentDto studentDto,int studentId);
	
	String deleteStudent(int studentId);
	
	ArrayList<StudentDto> getAllStudents();

}
