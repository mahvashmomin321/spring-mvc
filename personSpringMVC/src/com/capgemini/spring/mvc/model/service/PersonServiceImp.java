package com.capgemini.spring.mvc.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.spring.mvc.model.dao.PersonDao;
import com.capgemini.spring.mvc.model.entity.Person;

@Service
public class PersonServiceImp implements PersonService{

	
	@Autowired
	private PersonDao dao;
	
	public void addNew(Person person) {
		dao.addNew(person);
		
	}

	public List<Person> getAllDetails() {
		// TODO Auto-generated method stub
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
