package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
    @Id
	int id;
	String firstName;
	String lastName;
	int age;

	public Person(String firstName, String lastName, int age, int id) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
        this.id=id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "Person Id :"+ id + " First Name: " + firstName + " Last Name: " + lastName + " age: " + age;

	}

}
