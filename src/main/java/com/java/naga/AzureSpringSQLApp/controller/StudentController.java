package com.java.naga.AzureSpringSQLApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.naga.AzureSpringSQLApp.dto.StudentDto;
import com.java.naga.AzureSpringSQLApp.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/{id}")
	public StudentDto getStudent(@PathVariable Integer id ) {
		return studentService.getStudent(id);
	}
	
	@GetMapping()
	public List<StudentDto> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	
	@PostMapping()
	public String createStudent(@RequestBody StudentDto studentDto)
	{
		return studentService.createStudent(studentDto);	
	}

}
