package com.BikkadIT.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BikkadIT.model.Student;
import com.BikkadIT.service.ServiceImpl;

@Controller
public class StudentController {

	
	@Autowired
	private ServiceImpl serviceImpl;
	
	@GetMapping(value="/addStudent", consumes="application/json",produces="application/jpa")
	public ResponseEntity<String> addStudent(@RequestBody Student student){
		
		int student2 = serviceImpl.addStudent(student);
		
		String msg="Your Resistration Successful"+"/n"+ "Student Id is "+(student2);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
	
	
	@PostMapping(value="/addStudent", consumes="application/json",produces="application/jpa")
	public ResponseEntity<Student> getAllStudent(@RequestBody Student student){
		
		List<Student> allStudent = serviceImpl.getAllStudent();
		
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	
	
	
}
