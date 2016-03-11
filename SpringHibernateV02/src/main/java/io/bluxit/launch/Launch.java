package io.bluxit.launch;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.bluxit.dao.PersonDao;
import io.bluxit.model.Person;
import io.bluxit.to.PersonTO;

public class Launch {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		/*	Objeto del tipo de la interfaz, no de la implementación*/
		PersonDao p = (PersonDao) context.getBean("personDaoImpl");
		
		//	Add new person
		Person person1 = new Person();
		person1.setName("Goku");
		person1.setCountry("Paos");
		
		int a = p.insertRow(person1);
		
		//	Get all persons
		List<PersonTO> per = p.findAll();
		
		System.out.println(per);	
	}
}
