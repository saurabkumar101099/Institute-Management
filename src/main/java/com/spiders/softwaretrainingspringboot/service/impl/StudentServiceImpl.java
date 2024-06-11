package com.spiders.softwaretrainingspringboot.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.spiders.softwaretrainingspringboot.dao.StudentDao;
import com.spiders.softwaretrainingspringboot.dto.StudentDto;
import com.spiders.softwaretrainingspringboot.exception.EmailAlreadyExistsException;
import com.spiders.softwaretrainingspringboot.exception.StudentIdNotFoundException;
import com.spiders.softwaretrainingspringboot.repository.StudentRepository;
import com.spiders.softwaretrainingspringboot.service.StudentService;
import com.spiders.softwaretrainingspringboot.util.ResponseStructure;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired

	StudentDao studentDao;

	@Autowired
	StudentRepository studentRepository;

	@Override
	public ResponseStructure<StudentDto> saveStudent(StudentDto studentDto) {
if(studentRepository.existsByEmail(studentDto.getEmail()) ){
	throw new EmailAlreadyExistsException();
}
		ResponseStructure<StudentDto> responseStructure = new ResponseStructure<>();

		responseStructure.setStatus(HttpStatus.OK.value());

		responseStructure.setMessage("STUDENT SAVED TO DATABASE");

		responseStructure.setData(studentDao.saveStudent(studentDto));
		return responseStructure;
	}

	@Override
	public ResponseStructure<StudentDto> getStudentById(int studentId) {

		if (!studentRepository.existsById(studentId)) {
			throw new StudentIdNotFoundException();
		}

		ResponseStructure<StudentDto> responseStructure = new ResponseStructure<>();

		responseStructure.setStatus(HttpStatus.OK.value());

		responseStructure.setMessage("STUDENT IS RETRIVED");

		responseStructure.setData(studentDao.getStudentById(studentId));

		return responseStructure;

	}

	@Override
	public ResponseStructure<StudentDto> updateStudent(StudentDto studentDto, int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseStructure<String> deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseStructure<ArrayList<StudentDto>> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
