/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.k2600143.ecoride;

import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author arunagamage
 */

public class EcoRideSystem {
    private ArrayList<Car> cars = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void makeReservation(String id, Customer cust, Car car,
                                LocalDate start, LocalDate end, double km) {
        if (!car.getAvailability().equals("Available")) {
            System.out.println("Car is not available for booking.");
            return;
        }
        Reservation res = new Reservation(id, cust, car, start, end, km);
        reservations.add(res);
        car.updateAvailability("Reserved");
        System.out.println("Reservation Created: " + id);
    }

    public static void main(String[] args) {
        EcoRideSystem system = new EcoRideSystem();

        Car car1 = new Car("Car001", "Toyota Aqua", "Hybrid", 8000);
        system.addCar(car1);

        Customer customer1 = new Customer("893043450V", "Aruna Gamage", "0716639721", "aruna@gmail.com");

        system.makeReservation("R001", customer1, car1, LocalDate.now().plusDays(3), LocalDate.now().plusDays(10), 250);

        Invoice invoice1 = new Invoice(system.reservations.get(0));
        invoice1.calculateInvoice();
        invoice1.printInvoice();
        
        EcoRideSystem system2 = new EcoRideSystem();
        Car car2 = new Car("Car002", "Nissan Leaf", "Hybrid", 10000);
        system2.addCar(car2);

        Customer customer2 = new Customer("893043450V", "Saman Perera", "0773212346", "aruna@gmail.com");

        system2.makeReservation("R002", customer2, car2, LocalDate.now().plusDays(3), LocalDate.now().plusDays(10), 250);

        Invoice invoice2 = new Invoice(system2.reservations.get(0));
        invoice2.calculateInvoice();
        invoice2.printInvoice();
        
        EcoRideSystem system3 = new EcoRideSystem();
        Car car3 = new Car("Car003", "BMW X5", "Luxury SUV", 15000);
        system3.addCar(car3);

        Customer customer3 = new Customer("893043450V", "Kamal Perera", "0773212346", "aruna@gmail.com");

        system3.makeReservation("R003", customer3, car3, LocalDate.now().plusDays(3), LocalDate.now().plusDays(10), 250);

        Invoice invoice3 = new Invoice(system3.reservations.get(0));
        invoice3.calculateInvoice();
        invoice3.printInvoice();
        
        EcoRideSystem system4 = new EcoRideSystem();
        Car car4 = new Car("Car004", "BMW X5", "Compact Petrol", 5000);
        system4.addCar(car4);

        Customer customer4 = new Customer("893043450V", "Nimal Perera", "0773212346", "aruna@gmail.com");

        system4.makeReservation("R004", customer4, car4, LocalDate.now().plusDays(3), LocalDate.now().plusDays(10), 250);

        Invoice invoice4 = new Invoice(system4.reservations.get(0));
        invoice4.calculateInvoice();
        invoice4.printInvoice();
    }
}

