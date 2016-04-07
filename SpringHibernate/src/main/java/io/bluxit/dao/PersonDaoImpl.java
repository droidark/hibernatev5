package io.bluxit.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import io.bluxit.model.Person;

public class PersonDaoImpl implements PersonDao{
	
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public int insertRow(Person person) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(person);
		tx.commit();
		Serializable id = session.getIdentifier(person);
		session.close();
		return (Integer) id;
	}

	public List<Person> getList() {
		Session session = sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		session.close();
		return personList;
	}

	public Person getPersonById(int id) {
		Session session = sessionFactory.openSession();
		Person person = (Person) session.load(Person.class, id);
		return person;
	}

	public int updateRow(Person person) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(person);
		tx.commit();
		Serializable id = session.getIdentifier(person);
		session.close();
		return (Integer) id;
	}

	public int deleteRow(int id) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Person person = (Person) session.load(Person.class, id);
		tx.commit();
		Serializable ids = session.getIdentifier(person);
		session.close();
		return (Integer) ids;
	}
	

}
