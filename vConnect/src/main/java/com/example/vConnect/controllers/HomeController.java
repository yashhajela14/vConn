package com.example.vConnect.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vConnect.dao.IStudentRepository;
import com.example.vConnect.entities.Student;

@RestController
public class HomeController {

	@Autowired
	private IStudentRepository stuRepo;

	@GetMapping(value = "/home")
	public String displayHome() {
		return "hello";
	}
	@GetMapping(value = "/students")
	public List<Student> getStudents() {

		List<Student> s =(List<Student>) stuRepo.findAll();
		
		for(Student a: s)
			System.out.println(a.toString());
		
		return s;

	}

	@GetMapping(value = "/addstudents")
	public List<Student> addStudents() {

		stuRepo.save(new Student("Cosmo", "Kramer"));
		
		List<Student> s =(List<Student>) stuRepo.findAll();
		
		for(Student a: s)
			System.out.println(a.toString());
		
		return s;

	}
}
