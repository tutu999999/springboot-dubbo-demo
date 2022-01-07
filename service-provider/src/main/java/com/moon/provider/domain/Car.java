package com.moon.provider.domain;

import java.io.Serializable;

public class Car implements Serializable {
    private String make;
    private int numberOfSeats;
    private CarType type;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public enum CarType{
        BUS("公交", 1);
        private String name;
        private int code;

        CarType(String name, int code) {
            this.name = name;
            this.code = code;
        }
    }
}
