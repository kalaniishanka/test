package com.example.demo.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public interface PersonRepository extends MongoRepository <Person, Integer>{
	public Person findByFirstName(String firstName);
	//
	public Person findById(int id);
	//
	 public List<Person> findByAge(int age);

}
