/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.K2600143.ecoride;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author arunagamage
 */

public class K2600143_Reservation {
    private String reservationId;
    private K2600143_Customer customer;
    private K2600143_Car car;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalKm;
    private double deposit = 5000;

    public K2600143_Reservation(String reservationId, K2600143_Customer customer, K2600143_Car car,
                                LocalDate startDate, LocalDate endDate, double totalKm) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalKm = totalKm;
    }

    public long calculateDays() {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public K2600143_Customer getCustomer() { return customer; }
    public K2600143_Car getCar() { return car; }
    public double getDeposit() { return deposit; }
}
