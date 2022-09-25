package com.gl.collegeFest.lab5.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.gl.collegeFest.lab5.entities.Student;


@Service
public interface StudentService {
	
	public List<Student> findAll();
	
	public Student	findById(int id);
	
	public void save(Student student);
	
	public void deletById(int id);
	
	//public List<Student> searchBy(String name, String dept, String country);
	
}
