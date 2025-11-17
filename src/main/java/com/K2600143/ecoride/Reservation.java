/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k2600143.ecoride;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author arunagamage
 */

public class Reservation {
    private String reservationId;
    private Customer customer;
    private Car car;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalKm;
    private double deposit = 5000;

    public Reservation(String reservationId, Customer customer, Car car,
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

    public Customer getCustomer() { return customer; }
    public Car getCar() { return car; }
    public double getDeposit() { return deposit; }
}
