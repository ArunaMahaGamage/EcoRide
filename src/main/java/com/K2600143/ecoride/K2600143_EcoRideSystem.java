/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.K2600143.ecoride;

import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author arunagamage
 */

public class K2600143_EcoRideSystem {
    private ArrayList<K2600143_Car> cars = new ArrayList<>();
    private ArrayList<K2600143_Customer> customers = new ArrayList<>();
    private ArrayList<K2600143_Reservation> reservations = new ArrayList<>();

    public void addCar(K2600143_Car car) {
        cars.add(car);
    }

    public void makeReservation(String id, K2600143_Customer cust, K2600143_Car car,
                                LocalDate start, LocalDate end, double km) {
        if (!car.getAvailability().equals("Available")) {
            System.out.println("Car is not available for booking.");
            return;
        }
        K2600143_Reservation res = new K2600143_Reservation(id, cust, car, start, end, km);
        reservations.add(res);
        car.updateAvailability("Reserved");
        System.out.println("Reservation Created: " + id);
    }

    public static void main(String[] args) {
        K2600143_EcoRideSystem system = new K2600143_EcoRideSystem();

        K2600143_Car car1 = new K2600143_Car("Car001", "Toyota Aqua", "Hybrid", 8000);
        system.addCar(car1);

        K2600143_Customer customer1 = new K2600143_Customer("893043450V", "Aruna Gamage", "0716639721", "aruna@gmail.com");

        system.makeReservation("R001", customer1, car1, LocalDate.now().plusDays(3), LocalDate.now().plusDays(10), 250);

        K2600143_Invoice invoice1 = new K2600143_Invoice(system.reservations.get(0));
        invoice1.calculateInvoice();
        invoice1.printInvoice();
        
        K2600143_EcoRideSystem system2 = new K2600143_EcoRideSystem();
        K2600143_Car car2 = new K2600143_Car("Car002", "Nissan Leaf", "Hybrid", 10000);
        system2.addCar(car2);

        K2600143_Customer customer2 = new K2600143_Customer("893043450V", "Saman Perera", "0773212346", "aruna@gmail.com");

        system2.makeReservation("R002", customer2, car2, LocalDate.now().plusDays(3), LocalDate.now().plusDays(10), 250);

        K2600143_Invoice invoice2 = new K2600143_Invoice(system2.reservations.get(0));
        invoice2.calculateInvoice();
        invoice2.printInvoice();
        
        K2600143_EcoRideSystem system3 = new K2600143_EcoRideSystem();
        K2600143_Car car3 = new K2600143_Car("Car003", "BMW X5", "Luxury SUV", 15000);
        system3.addCar(car3);

        K2600143_Customer customer3 = new K2600143_Customer("893043450V", "Kamal Perera", "0773212346", "aruna@gmail.com");

        system3.makeReservation("R003", customer3, car3, LocalDate.now().plusDays(3), LocalDate.now().plusDays(10), 250);

        K2600143_Invoice invoice3 = new K2600143_Invoice(system3.reservations.get(0));
        invoice3.calculateInvoice();
        invoice3.printInvoice();
        
        K2600143_EcoRideSystem system4 = new K2600143_EcoRideSystem();
        K2600143_Car car4 = new K2600143_Car("Car004", "BMW X5", "Compact Petrol", 5000);
        system4.addCar(car4);

        K2600143_Customer customer4 = new K2600143_Customer("893043450V", "Nimal Perera", "0773212346", "aruna@gmail.com");

        system4.makeReservation("R004", customer4, car4, LocalDate.now().plusDays(3), LocalDate.now().plusDays(10), 250);

        K2600143_Invoice invoice4 = new K2600143_Invoice(system4.reservations.get(0));
        invoice4.calculateInvoice();
        invoice4.printInvoice();
    }
}

