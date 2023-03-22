package com.example.superherov5.controller;

import com.example.superherov5.model.Superhero;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SuperheroController {
    @GetMapping("/superhero")
    public String showForm(Model model) {
        Superhero superhero = new Superhero();
        model.addAttribute("superhero", superhero);
        return "registerForm";


    }
}
