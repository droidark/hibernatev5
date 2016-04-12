package net.virux.login.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import net.virux.login.dao.UserDao;
import net.virux.login.model.User;

public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public User findByUserName(String username) {
		List<User> users = new ArrayList<User>();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		users = session.createQuery("from User where username = :username").
		setString("username", username).list();
		tx.commit();
		session.close();
		if(users.size() > 0){
			return users.get(0);
		}
		return null;
	}
}
