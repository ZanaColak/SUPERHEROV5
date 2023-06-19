package com.example.superherov5.repositories;

import com.example.superherov5.model.Superhero;
import com.example.superherov5.repositories.util.DB_Connector;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepository implements ISuperheroRepository {

    @Override
    public List<Superhero> getAll() {
        List<Superhero> superheroList = new ArrayList<>();

        try {
            Connection conn = DB_Connector.getConnection();
            String SQL = "SELECT * FROM Superhero";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String heroName = resultSet.getString(2);
                String realName = resultSet.getString(3);
                int creationYear = resultSet.getInt(4);
                int cityID = resultSet.getInt("city_id");
                superheroList.add(new Superhero(id, heroName, realName, creationYear, cityID));
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return superheroList;
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
