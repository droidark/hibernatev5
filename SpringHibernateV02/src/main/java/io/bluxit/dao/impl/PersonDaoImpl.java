package io.bluxit.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Transactional;

import io.bluxit.dao.PersonDao;
import io.bluxit.model.Person;
import io.bluxit.to.PersonTO;

public class PersonDaoImpl implements PersonDao{
	
	
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int insertRow(Person person) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
		session.close();
		return 0;
	}
	
	@Override
	public List<PersonTO> findAll() {
		Session session =  sessionFactory.openSession();
		Criteria cr = session.createCriteria(Person.class);
		List<PersonTO> person = cr.list();
		session.close();
		return person;
	}

}
