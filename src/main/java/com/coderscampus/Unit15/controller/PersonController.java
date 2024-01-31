package com.coderscampus.Unit15.controller;

import com.coderscampus.Unit15.domain.Person;
import com.coderscampus.Unit15.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PersonController {
// REMEMBER
// Controllers want you to return a String to your view
// Notice on each return line we have a String
// Views are known as HTML files or JSP's (Java Server Pages)
    // Model - A hashmap that takes key's and values that are passed to the View
    // View - HTML files
    // Controller - files inside `web` package

    private PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/persons")
    //    Spring initializes the  (      model )  for us so we don't get a null pointer exception
    public String getPeople(ModelMap model) {
        List<Person> people = personService.findAll();
        Person person = new Person();
        // Model: A hashmap that takes key's and values that are passed to the View
        //       (  key   , value );  onto the model
        model.put("person", person);
        model.put("people", people);
        //  /src/main/resources/templates/{fileName}.html
        // return refers to the welcome.html file
        return "people";
    }

    @PostMapping("/persons")
    public String postPeople(Person person) {
        // Controllers should not call repositories directly
        // Controllers just handle routing things around and work with services
        Person savedPerson = personService.save(person);
        System.out.println("Saved Person: " + savedPerson);
        // You'll either `redirect:/` or input another HTML page in the return
        return "redirect:/persons";
    }

    @GetMapping("/persons/{personId}")
    public String getPerson(@PathVariable Integer personId, ModelMap model) {
        Person person = personService.findById(personId);
        model.put("person", person);
        return "people";
    }

    @PostMapping("/persons/{personId}")
    public String postPerson(Person person) {
        Person savedPerson = personService.save(person);
        System.out.println("Updated Person: " + savedPerson);
        return "redirect:/persons/" + savedPerson.getId();
    }

    @PostMapping("/persons/{personId}/delete")
    public String deletePerson(@PathVariable Integer personId) {
        personService.delete(personId);
        return "redirect:/persons";
    }

}
