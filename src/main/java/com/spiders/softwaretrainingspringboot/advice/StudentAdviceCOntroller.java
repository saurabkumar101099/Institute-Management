package com.spiders.softwaretrainingspringboot.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spiders.softwaretrainingspringboot.exception.EmailAlreadyExistsException;
import com.spiders.softwaretrainingspringboot.exception.StudentIdNotFoundException;

@ControllerAdvice
public class StudentAdviceCOntroller {

	@ExceptionHandler(StudentIdNotFoundException.class)

	public ResponseEntity<String> handleStudentIdNotFoundException(StudentIdNotFoundException e) {
		
		return new ResponseEntity<String>("THE STUDENT WITH THE ID DOES NOT EXSIST TRY WITH ANOTHER ID",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmailAlreadyExistsException.class)

	public ResponseEntity<String> handleEmailIdAlreadyExists(EmailAlreadyExistsException e) {
		
		return new ResponseEntity<String>("THE EMAIL ID IS ALREADY USED , TRY WITH NEW EMAIL-ID",HttpStatus.NOT_FOUND);
	}

}
