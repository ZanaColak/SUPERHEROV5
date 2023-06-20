package com.example.superherov5.service;

import com.example.superherov5.model.Superhero;
import com.example.superherov5.repositories.ISuperheroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperheroService {

    private final ISuperheroRepository iSuperheroRepository;

    public SuperheroService(ISuperheroRepository iSuperheroRepository) {
        this.iSuperheroRepository = iSuperheroRepository;
    }
    public List<Superhero> getAll() {
        return iSuperheroRepository.getAll();
    }
    public Superhero createSuperhero(Superhero hero) {
        return iSuperheroRepository.createSuperhero(hero);
    }
}
