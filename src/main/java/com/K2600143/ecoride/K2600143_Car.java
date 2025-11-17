package com.K2600143.ecoride;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arunagamage
 */

public class K2600143_Car {
    private String carId;
    private String model;
    private String category;
    private double dailyRate;
    private String availability;

    public K2600143_Car(String carId, String model, String category, double dailyRate) {
        this.carId = carId;
        this.model = model;
        this.category = category;
        this.dailyRate = dailyRate;
        this.availability = "Available";
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

