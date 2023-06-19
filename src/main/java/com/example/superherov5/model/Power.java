package com.example.superherov5.model;

public class Power {
    private int powerID;
    private String name;

    public Power() {
    }

    public Power(int powerID, String name) {
        this.powerID = powerID;
        this.name = name;
    }

    public int getPowerID() {
        return powerID;
    }

    public void setPowerID(int powerID) {
        this.powerID = powerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

