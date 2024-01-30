package com.coderscampus.Unit15.service;

import com.coderscampus.Unit15.domain.Person;
import com.coderscampus.Unit15.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    Integer personId = 1;

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person save(Person person) {
        if (person.getId() == null) {
            person.setId(personId++);
        }
        return personRepository.save(person);
    }

    public Person findById(Integer personId) {
        return personRepository.findById(personId);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

}
