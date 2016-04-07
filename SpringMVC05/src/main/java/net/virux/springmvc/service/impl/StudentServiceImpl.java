package net.virux.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.virux.springmvc.dao.StudentDao;
import net.virux.springmvc.model.Student;
import net.virux.springmvc.service.StudentService;

public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	@Override
	public List<Student> listStudents() {
		return studentDao.listStudents();
	}

	@Override
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}

	@Override
	public void deleteStudent(Student student) {
		studentDao.deleteStudent(student);
	}
	

}
