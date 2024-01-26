package com.coderscampus.Unit15.controller;

import com.coderscampus.Unit15.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("")
    public String getRootWebPage(ModelMap model) {
        // Returns location of the HTML file
        // This is what get's returned/resolved when we
        // return a String inside of a regular Controller @GetMapping method
        // The return will go to..../src/main/resources/templates/{fileName_here}.html
//        String firstName = "Johnny";
//        String lastName = "Bananas";
//        model.put("firstName", firstName);
//        model.put("lastName", lastName);

        Person person = new Person();
        return "welcome";
    }
}
