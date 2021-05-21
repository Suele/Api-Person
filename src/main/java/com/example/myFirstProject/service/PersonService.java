package com.example.myFirstProject.service;

import com.example.myFirstProject.entity.Person;
import com.example.myFirstProject.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService (PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person createPerson (Person person) {
        if (person != null) {
            return personRepository.save(person);
        }
        throw new NullPointerException("O objeto pessoa é null.");
    }

    public List<Person> listPersons () {
        List<Person> person = personRepository.findAll();
        if (person.size() == 0) {
            throw new NullPointerException("A lista de pessoas está fazia.");
        } else {
            return person;
        }
    }

}
