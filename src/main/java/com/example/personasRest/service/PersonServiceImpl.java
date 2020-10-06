package com.example.personasRest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.personasRest.entity.Person;
import com.example.personasRest.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Person> findAll() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Person> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return personRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Person> findByID(Long id) {
		// TODO Auto-generated method stub
		return personRepository.findById(id);
	}

	@Override
	@Transactional
	public Person save(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
	}

}
