package io.bluxit.service;

import io.bluxit.model.Person;

public interface PersonService {
	Person getFoo(String name);
	
	Person getFoo(String name, String barName);
	
	void insertFoo(Person person);
	
	void updateFoo(Person person);

}
