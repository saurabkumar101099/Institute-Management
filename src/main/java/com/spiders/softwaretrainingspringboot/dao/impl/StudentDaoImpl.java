package com.spiders.softwaretrainingspringboot.dao.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spiders.softwaretrainingspringboot.dao.StudentDao;
import com.spiders.softwaretrainingspringboot.dto.StudentDto;
import com.spiders.softwaretrainingspringboot.repository.StudentRepository;


@Repository
public class StudentDaoImpl implements StudentDao{

	
	@Autowired
	
	StudentRepository studentRepository;
	@Override
	public StudentDto saveStudent(StudentDto studentDto) {
		
		return studentRepository.save(studentDto);
	}

	@Override
	public StudentDto getStudentById(int studentId) {
		
		Optional<StudentDto> optional= studentRepository.findById(studentId);
	
		return optional.get();
	}

	@Override
	public StudentDto updateStudent(StudentDto studentDto, int studentId) {
		StudentDto exsistingStudent = this.getStudentById(studentId);
		
		
		if(exsistingStudent!=null) {
			exsistingStudent.setEmail(studentDto.getEmail());
			exsistingStudent.setPassword(studentDto.getPassword());
			exsistingStudent.setQualification(studentDto.getQualification());
			exsistingStudent.setStudentName(studentDto.getStudentName());
			
			return studentRepository.save(exsistingStudent);
		}
		return null;
	}

	@Override
	public String deleteStudent(int studentId) {
		
		studentRepository.deleteById(studentId);
		
		return "STUDENT IS DELETED";
	}

	@Override
	public ArrayList<StudentDto> getAllStudents() {
	
		return (ArrayList<StudentDto>) studentRepository.findAll();
	}

}
