package com.example.superherov5.repositories;

import com.example.superherov5.model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SuperheroRepository implements ISuperheroRepository{
    @Override
    public List<Superhero> getAll() {
        return null;
    }

    @Override
    public void save(Superhero hero) {

    }

    @Override
    public void saveAll(List<Superhero> superheroes) {

    }

    @Override
    public List<String> getCities() {
        return null;
    }

    @Override
    public List<String> getPowers() {
        return null;
    }
}
