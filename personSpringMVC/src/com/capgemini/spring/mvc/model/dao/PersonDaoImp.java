package com.capgemini.spring.mvc.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.mvc.model.entity.Person;

@Repository
public class PersonDaoImp implements PersonDao {

	@Autowired
	private JdbcTemplate template;

	
	public void addNew(Person person) {
		template.update("INSERT INTO person VALUES(?,?)",new Object[] {person.getPersonId(),person.getPersonNmae()});
	}

	public List<Person> getAllDetails() {
		String query="SELECT * FROM person";
		return null;
		
	}

	public void update(Person person) {
		// TODO Auto-generated method stub

	}

	public void delete(int personId) {
		// TODO Auto-generated method stub

	}

	public Person getPerson(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

}
