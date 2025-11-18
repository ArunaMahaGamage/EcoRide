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
    
    private static int carId = 1;

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
        System.out.println("\nReservation Created: " + id + "\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        EcoRideSystem system = new EcoRideSystem();

        Car car = new Car();
        car.setCarId("Car00" + carId);
        
        System.out.println("=== Enter Car Model ===");
        System.out.println("Eg :: Toyota Aqua");
        String model = scanner.nextLine().trim();
        car.setModel(model);
        
        System.out.println("=== Enter Car Category ===");
        System.out.println("Eg :: Compact Petrol," +" Hybrid," +" Electric," +" Luxury SUV ");
        String category = scanner.nextLine().trim();
        car.setCategory(category);
        
        try {
            System.out.println("=== Enter Car Daily Rate ===");
            System.out.println("Daily Rentals :: Compact Petrol Car : LKR 5,000, Hybrid Car	LKR 7,500, Electric Car	LKR 10,000, Luxury SUV	LKR 15,000");
            System.out.println("Eg :: Value Should Be double");
            String dailyRate = scanner.nextLine().trim();
            double rate = Double.parseDouble(dailyRate);
            car.setDailyRate(rate);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Please try again.");
        }
        car.setAvailability("Available");
        
        System.out.println("\n\nEnter Customer Details\n");

        system.addCar(car);

        Customer customer = new Customer();
        System.out.println("Enter Customer Name");
        String name = scanner.nextLine().trim();
        customer.setName(name);
        
        System.out.println("Enter Customer NIC or Passport");
        String nicOrPassport = scanner.nextLine().trim();
        customer.setNicOrPassport(nicOrPassport);
        
        System.out.println("==Enter Customer Telephone Number==");
        String contact = scanner.nextLine().trim();
        customer.setContact(contact);
        
        System.out.println("Enter Customer Email Address");
        String email = scanner.nextLine().trim();
        customer.setEmail(email);

        system.makeReservation("R001", customer, car, LocalDate.now().plusDays(3), LocalDate.now().plusDays(10), 250);

        Invoice invoice1 = new Invoice(system.reservations.get(0));
        invoice1.calculateInvoice();
        invoice1.printInvoice();
    }
}

