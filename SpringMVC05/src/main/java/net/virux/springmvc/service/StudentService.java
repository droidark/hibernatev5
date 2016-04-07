package net.virux.springmvc.service;

import java.util.List;

import net.virux.springmvc.model.Student;

public interface StudentService {
	
	public void addStudent(Student student);
	
	public List<Student> listStudents();
	
	public Student getStudent(int id);
	
	public void deleteStudent(Student student);

}
