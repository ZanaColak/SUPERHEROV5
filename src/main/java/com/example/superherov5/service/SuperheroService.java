package com.example.superherov5.service;

import com.example.superherov5.repositories.ISuperheroRepository;
import org.springframework.stereotype.Service;

@Service
public class SuperheroService {

    private final ISuperheroRepository iSuperheroRepository;

    public SuperheroService(ISuperheroRepository iSuperheroRepository) {
        this.iSuperheroRepository = iSuperheroRepository;
    }
}
