package com.example.myFirstProject.resources;

import com.example.myFirstProject.entity.Person;
import com.example.myFirstProject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonResource {

    private final PersonService personService;

    @Autowired
    public PersonResource (PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> listPersons () {
        return personService.listPersons();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person createPerson (@RequestBody Person person) {
        return personService.createPerson(person);
    }

}
