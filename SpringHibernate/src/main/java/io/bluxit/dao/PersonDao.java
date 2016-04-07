package io.bluxit.dao;

import java.util.List;

import io.bluxit.model.Person;

public interface PersonDao {
	
	public int insertRow(Person person);
	
	public List<Person> getList();
	
	public Person getPersonById(int id);
	
	public int updateRow(Person person);
	
	public int deleteRow(int id);

}
