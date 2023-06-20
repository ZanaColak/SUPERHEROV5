package com.example.superherov5.repositories;

import com.example.superherov5.model.Superhero;

import java.util.List;

public interface ISuperheroRepository {
    List<Superhero> getAll();
    Superhero createSuperhero(Superhero hero);
    void saveAll(List<Superhero> superheroes);

    List<String> getCities();

    List<String> getPowers();
}
