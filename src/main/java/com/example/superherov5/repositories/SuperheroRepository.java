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
    public Superhero createSuperhero(Superhero hero) {
        try {
            Connection conn = DB_Connector.getConnection();
            String SQL = "INSERT INTO superhero (heroName, realName, creationYear, city_id) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(SQL);

            preparedStatement.setString(1, hero.getHeroName());
            preparedStatement.setString(2, hero.getRealName());
            preparedStatement.setInt(3, hero.getCreationYear());
            preparedStatement.setInt(4, hero.getCityID());
            preparedStatement.executeUpdate();

            return hero;

        }catch (SQLException e){
            throw new RuntimeException();
        }
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
