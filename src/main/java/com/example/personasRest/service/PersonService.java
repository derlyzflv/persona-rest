package com.example.personasRest.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.personasRest.entity.Person;

public interface PersonService {

	public Iterable<Person> findAll();
	
	public Page<Person> findAll(Pageable pageable);
	
	public Optional<Person> findByID(Long id);
	
	public Person save(Person person);
	
	public void deleteById(Long id);
}
