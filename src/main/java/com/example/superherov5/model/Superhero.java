package com.example.superherov5.model;

public class Superhero {
    private String heroName;
    private String realName;
    private int creationYear;
    private String powerName;
    private String cityName;

    public String getHeroName() {
        return heroName;
    }

    public String getRealName() {
        return realName;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getPowerName() {
        return powerName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String toString() {
        return "Hero Name: " + heroName + "," + " Real Name: " + realName + "," + " Birthdate: " + creationYear + "," +
                " Superpower: " + powerName + "," + " City Name: " + cityName;
    }
}
