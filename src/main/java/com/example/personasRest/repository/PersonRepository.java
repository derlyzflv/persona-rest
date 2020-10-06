package com.example.personasRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.personasRest.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
}
