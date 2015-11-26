package net.virux.hibernate;

import org.hibernate.Session;

import net.virux.hibernate.model.Student;

public class HibernateStandAloneDemo {
	
	public static void main(String[] args){
		
		Student student = new Student();
		student.setFirstName("Nombre");
		student.setLastName("Apellido");
		student.setSection("Math");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		
		session.close();
		System.out.println("ADIOS");
		
	}
}
