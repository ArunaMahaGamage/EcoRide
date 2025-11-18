package com.k2600143.ecoride;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arunagamage
 */

public class Car {
    private String carId;
    private String model;
    private String category;
    private double dailyRate;
    private String availability;

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }


    public String getCarId() { return carId; }
    public String getModel() { return model; }
    public String getCategory() { return category; }
    public double getDailyRate() { return dailyRate; }
    public String getAvailability() { return availability; }

    public void updateAvailability(String status) {
        this.availability = status;
    }

    public String getDetails() {
        return carId + " | " + model + " | " + category + " | LKR " + dailyRate + " | " + availability;
    }
}

