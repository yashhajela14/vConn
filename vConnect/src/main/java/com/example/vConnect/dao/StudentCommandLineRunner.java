package com.example.vConnect.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.stereotype.Component;

import com.example.vConnect.entities.Student;

@Profile("dev")
@Component
public class StudentCommandLineRunner implements CommandLineRunner {

	public static final Logger log = LoggerFactory.getLogger(StudentCommandLineRunner.class);
			
	
	@Autowired
	private IStudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Student("Siddarth","Jangid"));
		repo.save(new Student("Sanjeev","Kumar"));
		repo.save(new Student("Robin","Singh"));
		repo.save(new Student("Ravi Karan","Singh"));
		repo.save(new Student("Yash","Hajela"));
	
		for(Student s: repo.findAll())
			log.info(s.toString());
		
	}
	
	
	
	
	
}
