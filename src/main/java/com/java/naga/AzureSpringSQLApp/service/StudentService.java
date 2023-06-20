package com.java.naga.AzureSpringSQLApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.naga.AzureSpringSQLApp.dto.StudentDto;
import com.java.naga.AzureSpringSQLApp.model.Student;
import com.java.naga.AzureSpringSQLApp.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public StudentDto getStudent(Integer id) {
		Optional<Student> optStudent=studentRepository.findById(id);
		if(optStudent.isPresent()) {
			Student student=optStudent.get();
			return StudentDto.builder()
							.name(student.getName())
							.age(student.getAge())
							.city(student.getCity())
							.build();
		}
		else{
			return null;
		}
		
	}

	public List<StudentDto> getAllStudents() {
		List<Student> students=studentRepository.findAll();
		if(students!=null) {
			return students.stream().map(student -> mapToDto(student)).toList();
		}
		return null;
	}

	private StudentDto mapToDto(Student student) {
		
		return StudentDto.builder()
				.name(student.getName())
				.age(student.getAge())
				.city(student.getCity())
				.build();
	}

	public String createStudent(StudentDto studentDto) {
		Student student=Student.builder()
						.name(studentDto.getName())
						.age(studentDto.getAge())
						.city(studentDto.getCity())
						.build();
		try {
			studentRepository.save(student);
		}
		catch(Exception e)
		{
			return "Exception occured try again";
		}
		return "Student details saved to db "+student.getId();
	}

}
