package com.example.superherov5.repositories;

import com.example.superherov5.dto.SuperheroFormDTO;
import com.example.superherov5.model.Superhero;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class DBRepository {
    @Value("${spring.datasource.url}")
    private String DbUrl;
    @Value("${spring.datasource.username}")
    private String UID;
    @Value("${spring.datasource.password}")
    private String Pwd;

    public Connection connect() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DbUrl, UID, Pwd);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public List<SuperheroFormDTO> getAllSuperHeroes() {
        List<SuperheroFormDTO> superheroList = new ArrayList<>();
        try {
            String SQL = "SELECT superhero.id, superhero.superheroName, superhero.realName, superhero.creationYear,powers.powerName, city.cityName\n" +
                    "        FROM superhero\n" +
                    "        INNER JOIN powers ON superhero.id = powers.superhero_id\n" +
                    "        RIGHT JOIN city ON powers.superhero_id = city.superhero_id;";
            Statement stmt = connect().createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                int heroId = rs.getInt(1);
                String heroName = rs.getString("superheroName");
                String realName = rs.getString("realName");
                int creationYear = rs.getInt(1);
                String city = rs.getString("cityName");
                List<String> powerList = Collections.singletonList(rs.getString("powerName"));
                superheroList.add(new SuperheroFormDTO(heroId, heroName, realName, creationYear, city, powerList));
            }
            return superheroList;

        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}