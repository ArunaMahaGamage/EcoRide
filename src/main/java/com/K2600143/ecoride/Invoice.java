/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k2600143.ecoride;

/**
 *
 * @author arunagamage
 */
public class Invoice {
    private Reservation reservation;
    private double basePrice, discount, tax, finalAmount;

    public Invoice(Reservation reservation) {
        this.reservation = reservation;
    }

    public void calculateInvoice() {
        long days = reservation.calculateDays();
        double rate = reservation.getCar().getDailyRate();
        basePrice = days * rate;
        discount = (days >= 7) ? basePrice * 0.10 : 0;

        double taxRate;
        switch (reservation.getCar().getCategory()) {
            case "Compact Petrol": taxRate = 0.05; break;
            case "Hybrid": taxRate = 0.08; break;
            case "Electric": taxRate = 0.06; break;
            case "Luxury SUV": taxRate = 0.12; break;
            default: taxRate = 0.08;
        }

        tax = basePrice * taxRate;
        finalAmount = basePrice - discount + tax - reservation.getDeposit();
    }

    public void printInvoice() {
        System.out.println("------ INVOICE ------");
        System.out.println("Customer: " + reservation.getCustomer().getName());
        System.out.println("Car Model: " + reservation.getCar().getModel());
        System.out.println("Base Price: LKR " + basePrice);
        System.out.println("Discount: LKR " + discount);
        System.out.println("Tax: LKR " + tax);
        System.out.println("Deposit Deducted: LKR " + reservation.getDeposit());
        System.out.println("Final Payable Amount: LKR " + finalAmount);
        System.out.println("----------------------");
    }
}