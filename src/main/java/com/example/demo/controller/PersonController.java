package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {

	@Autowired 
	PersonService personService;
	
	
	@RequestMapping("/create")
	public String create(@RequestParam String firstName,@RequestParam String lastName,@RequestParam int age,@RequestParam int id) {
		Person p = personService.create(firstName, lastName, age,id);
		return p.toString();
		}
	
	@RequestMapping("/get")
	
	public Person getPerson(@RequestParam String firstName) {
		return personService.getByFirstName(firstName);
	}
	
	@RequestMapping("/getAll")
	
    public List<Person> getAll(){
		
		return personService.getAll();
	}
	
	@RequestMapping("/update")
	
	public String update(@RequestParam String firstName,@RequestParam String lastName,@RequestParam int age) {
		Person p=personService.update(firstName, lastName, age);
		return p.toString();
		
		
	}
	@RequestMapping("/delete")
	
	public String delete(@RequestParam int id) {
		personService.delete(id);
		return "Deleted";
	}
	@RequestMapping("/deleteAll")
	public String delete () {
		personService.deleteAll();
		return "Deleted All";
	}
}