package com.example.personasRest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.personasRest.entity.Person;
import com.example.personasRest.service.PersonService;

@RestController
@RequestMapping("/api/users")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	// Create a new person
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Person person){
		return  ResponseEntity.status(HttpStatus.CREATED).body(personService.save(person));
		
	}
	
	// Read an person
	@GetMapping("/{id}")
	public ResponseEntity<?> read (@PathVariable(value = "id") Long userId){
		Optional<Person> oPerson = personService.findByID(userId);
		
		if (!oPerson.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oPerson);
	}
}
