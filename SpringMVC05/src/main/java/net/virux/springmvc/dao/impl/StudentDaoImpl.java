package net.virux.springmvc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.virux.springmvc.dao.StudentDao;
import net.virux.springmvc.model.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> listStudents() {
		return (List<Student>) sessionFactory.getCurrentSession().createCriteria(Student.class).list();
	}

	@Override
	public Student getStudent(int id) {
		return (Student) sessionFactory.getCurrentSession().get(Student.class, id);
	}

	@Override
	public void deleteStudent(Student student) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM student where id ")
		.setParameter("id", student.getId());
		
	}
	
	
}
