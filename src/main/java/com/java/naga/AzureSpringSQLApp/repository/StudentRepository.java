package com.java.naga.AzureSpringSQLApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.naga.AzureSpringSQLApp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
