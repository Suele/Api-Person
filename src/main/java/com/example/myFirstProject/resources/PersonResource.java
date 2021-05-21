package com.example.myFirstProject.resources;

import com.example.myFirstProject.entity.Person;
import com.example.myFirstProject.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonResource {

    private final PersonRepository personRepository;

    @Autowired
    public PersonResource (PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping
    public List<Person> listPersons () {
        List<Person> person = personRepository.findAll();
        if (person.size() == 0) {
            throw new NullPointerException("A lista de pessoas está fazia.");
        } else {
            return person;
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person createPerson (@RequestBody Person person) {
        return personRepository.save(person);
    }

}
