/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k2600143.ecoride;

/**
 *
 * @author arunagamage
 */
public enum VehicleCategory {
    COMPACT_PETROL_CAR(
            5000,
            100,
            50,
            0.10
    ),

    HYBRID_CAR(
            7500,
            150,
            60,
            0.12
    ),

    ELECTRIC_CAR(
            10000,
            200,
            40,
            0.08
    ),

    LUXURY_SUV(
            15000,
            250,
            75,
            0.15
    );

    private final int dailyRentalFee;
    private final int freeKmPerDay;
    private final int extraKmCharge;
    private final double taxRate;

    VehicleCategory(int dailyRentalFee, int freeKmPerDay, int extraKmCharge, double taxRate) {
        this.dailyRentalFee = dailyRentalFee;
        this.freeKmPerDay = freeKmPerDay;
        this.extraKmCharge = extraKmCharge;
        this.taxRate = taxRate;
    }

    public int getDailyRentalFee() {
        return dailyRentalFee;
    }

    public int getFreeKmPerDay() {
        return freeKmPerDay;
    }

    public int getExtraKmCharge() {
        return extraKmCharge;
    }

    public double getTaxRate() {
        return taxRate;
    }

}
