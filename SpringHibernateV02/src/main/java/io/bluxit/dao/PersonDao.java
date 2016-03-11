package io.bluxit.dao;

import java.util.List;

import io.bluxit.model.Person;
import io.bluxit.to.PersonTO;

public interface PersonDao {
	
	public int insertRow(Person person);
	
	public List<PersonTO> findAll();

}
