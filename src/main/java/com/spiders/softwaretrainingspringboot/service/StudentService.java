package com.spiders.softwaretrainingspringboot.service;

import java.util.ArrayList;

import com.spiders.softwaretrainingspringboot.dto.StudentDto;
import com.spiders.softwaretrainingspringboot.util.ResponseStructure;

public interface StudentService {

	ResponseStructure<StudentDto> saveStudent(StudentDto studentDto);

	ResponseStructure<StudentDto> getStudentById(int studentId);

	ResponseStructure<StudentDto> updateStudent(StudentDto studentDto, int studentId);

	ResponseStructure<String> deleteStudent(int studentId);
	
	ResponseStructure<ArrayList<StudentDto>> getAllStudent();

}
