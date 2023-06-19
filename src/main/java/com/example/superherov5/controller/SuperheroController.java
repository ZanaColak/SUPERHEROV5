package com.example.superherov5.controller;

import com.example.superherov5.model.Superhero;
import com.example.superherov5.service.SuperheroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class SuperheroController {

    private final SuperheroService service;

    public SuperheroController(SuperheroService service) {
        this.service = service;
    }

    @GetMapping("/superheroes")
    public String getSuperheroes(Model model) {
        List<Superhero> superheroList = service.getAll();
        model.addAttribute("superheroList", superheroList);
        return "superheroes";
    }

}
