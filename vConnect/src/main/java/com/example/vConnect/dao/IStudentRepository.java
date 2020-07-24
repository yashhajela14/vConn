package com.example.vConnect.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.vConnect.entities.Student;

public interface IStudentRepository extends CrudRepository<Student, Integer>{

}
