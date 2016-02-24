package io.bluxit.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PersonDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Person p){
		Session session = this.sessionFactory.openSession();
		Transaction tx =  session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}
	
	public List<Person> list(){
		Session session = this.sessionFactory.openSession();
		List<Person> personList = session.createQuery("from Person").list();
		session.close();
		return personList;
	}

}
