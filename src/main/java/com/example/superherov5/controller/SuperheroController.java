package com.example.superherov5.controller;

import com.example.superherov5.service.SuperheroService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SuperheroController {

    private final SuperheroService service;

    public SuperheroController(SuperheroService service) {
        this.service = service;
    }
}
