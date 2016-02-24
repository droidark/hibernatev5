package io.bluxit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.bluxit.model.PersonDAO;

public class InsertTest {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PersonDAO person = (PersonDAO) context.getBean("PersonDAO");
		
//		Person p = new Person();
//		p.setId(3);
//		p.setName("prueba2");
//		p.setCountry("Qatar");
//		
//		person.save(p);
		
		System.out.println(person.list());
	}
}
