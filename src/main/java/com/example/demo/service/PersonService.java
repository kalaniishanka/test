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
    public Person create(String firstName,String lastName,int age) {
	return personRepository.save((new Person(firstName,lastName,age)));
    }
//Retrieve
	public List<Person> getAll(){
		return personRepository.findAll();
		
			}
    
   
 public Person getByFirstName(String firstName) {
	   
	   return personRepository.findByFirstName(firstName);
   }



}
