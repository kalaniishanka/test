package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

//create
	public Person create(String firstName, String lastName, int age, int id) {

		System.out.println(id);
		return personRepository.save(new Person(firstName, lastName, age, id));
	}

//Retrieve
	public List<Person> getAll() {
		return personRepository.findAll();

	}

	public Person getByFirstName(String firstName) {

		return personRepository.findByFirstName(firstName);
	}

//Update
	public Person update(String firstName, String lastName, int age) {
		Person p = personRepository.findByFirstName(firstName);
		p.setLastName(lastName);
		p.setAge(age);
		return personRepository.save(p);

	}

	// Delete
	//
	public void delete(int id) {
		Person p = personRepository.findById(id);

		personRepository.delete(p);

	}

	public void deleteAll() {
		personRepository.deleteAll();

	}

}
