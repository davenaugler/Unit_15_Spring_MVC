package com.coderscampus.Unit15.controller;

import com.coderscampus.Unit15.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WelcomeController {
    @GetMapping("")
    //    Spring initializes the  (      model )  for us so we don't get a null pointer exception
    public String getRootWebPage(ModelMap model) {

        Person person = new Person();
        //       (  key   , value );  onto the model
        model.put("person", person);


        // We put the person into the model
        // and when we say return "welcome";
        // we are returning a view, and this view will contain the model
        return "welcome";
    }

    @PostMapping("")
    public String postRootWebPage(Person person) {
        System.out.println("Returning person object: " + person);
        // This "redirect:/" tells PostMapping to load the root again.
        // The root being the GetMapping(""), above
        return "redirect:/";
    }
}
